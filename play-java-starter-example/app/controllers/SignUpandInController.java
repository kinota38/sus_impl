package controllers;

import play.mvc.*;
import views.html.*;
import views.html.section.*;
import views.html.section.grades.*;
import views.html.calendar.*;
import io.ebean.Ebean;
import models.User;
import java.util.List;
import play.libs.Json;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import utility.Digest;

import java.util.Optional;
import java.util.UUID;

import models.sample;

public class SignUpandInController extends Controller {

    //トップ画面
    public Result helperTopForm() {
        return ok(helpertop.render());}
    public Result helperTop() {
        return ok(helpertop.render());
    }


    public Result signupForm() {
        return ok(signup.render());
    }

    //Userのリストを返す
    public Result userList() {
        List<User> entries = Ebean.find(User.class).findList();
        return ok(Json.toJson(entries));
    }

    public Result registerUser() {
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            // モデル更新
            String username = request.get("name")[0];
            String pass = request.get("pass1")[0];
            int highschool_area = Integer.parseInt(request.get("highschool_area")[0]);
            int highschool = Integer.parseInt(request.get("highschool")[0]);
            final String salt = UUID.randomUUID().toString();
            Digest dig = new Digest(salt);//ダイジェスト化に用いる
            try {
                String digested = dig.toDigestString(pass);
                final User entry = new User(username, digested,salt,highschool_area,highschool);
                entry.save();
            } catch (NoSuchAlgorithmException e) {
                System.out.println(e);
            }
            return ok();
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }
    }


    public Result signinForm() {
        String sessionid;
        try {
            sessionid = request().cookies().get("sessionid").value();
        } catch (Exception e) {
            return ok(signin.render(""));
        }
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",sessionid).findOneOrEmpty();
        if(user.isPresent()){
            sample data1 = new sample("aaa");
            data1.user = user.get();
            sample data2 = new sample("bbb");
            data2.user = user.get();
            data1.save();
            data2.save();



            return redirect("/helper/" + user.get().username+user.get().ss.get(0).message);
        }
        return ok(signin.render(""));

    }

    public Result signIn(){

        final String name1 = request().body().asFormUrlEncoded().get("name")[0];
        final String pass1 = request().body().asFormUrlEncoded().get("pass")[0];

            try {
                final Optional<User> user = Ebean.find(User.class).where().eq("username",name1).findOneOrEmpty();
                if(user.isPresent()){
                    User one = user.get();
                    Digest dig = new Digest(one.salt);//ダイジェスト化に用いる
                    if(dig.toDigestString(pass1).equals(one.password)){
                        final String sessionid = UUID.randomUUID().toString();
                        one.sessionid = sessionid;
                        one.save();
                        response().setCookie(Http.Cookie.builder("sessionid",sessionid).build());
                        return redirect("/helper/"+one.username);
                    }

                }

            } catch (NoSuchAlgorithmException e) {

            }
        return unauthorized(signin.render("Username or Password inccorect"));
    }


}

