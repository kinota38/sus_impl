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
            Digest dig = new Digest(username);//ダイジェスト化に用いる
            try {
                String digested = dig.toDigestString(pass);
                final User entry = new User(username, digested);
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
            return redirect("/helper/" + user.get().username);
        }
        return ok(signin.render(""));

    }

    public Result signIn(){

        final String name1 = request().body().asFormUrlEncoded().get("name")[0];
        final String pass1 = request().body().asFormUrlEncoded().get("pass")[0];

        Digest dig = new Digest(name1);//ダイジェスト化に用いる


            try {
                final Optional<User> user = Ebean.find(User.class).where().eq("username",name1)
                        .where().eq("password",dig.toDigestString(pass1)).findOneOrEmpty();
                if(user.isPresent()){
                    final String sessionid = UUID.randomUUID().toString();
                    user.get().sessionid = sessionid;
                    user.get().save();
                    response().setCookie(Http.Cookie.builder("sessionid",sessionid).build());
                    return redirect("/helper/"+user.get().username);
                }

            } catch (NoSuchAlgorithmException e) {

            }
        return unauthorized(signin.render("Username or Password inccorect"));
    }


}

