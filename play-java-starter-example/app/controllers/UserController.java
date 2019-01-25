package controllers;

import play.mvc.*;
import views.html.*;
import io.ebean.Ebean;
import models.User;
import java.util.List;
import play.libs.Json;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import utility.Digest;

import java.util.Optional;
import java.util.UUID;


public class UserController extends Controller {

    //トップ画面
    public Result helperTopForm() {
        return ok(helpertop.render());}
    public Result helperTop() {
        return ok(helpertop.render());
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
            String highschool_area = request.get("highschool_area")[0];
            String highschool = request.get("highschool")[0];
            String uni_area = request.get("uni_area")[0];
            String university = request.get("university")[0];
            String major = request.get("major")[0];
            final String salt = UUID.randomUUID().toString();
            Digest dig = new Digest(salt);//ダイジェスト化に用いる
            try {
                String digested = dig.toDigestString(pass);
                final User entry = new User(username, digested,salt,highschool_area,highschool,uni_area,university,major);
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
        String sessionId;
        try {
            sessionId = request().cookies().get("sessionid").value();
        } catch (Exception e) {
            return ok(signin.render(""));
        }
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",sessionId).findOneOrEmpty();
        if(user.isPresent()){
            return redirect("/helper/" + user.get().username);
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

    /**
     * cookieをクリアし、トップページへ戻す
     * @return トップページ
     */
    public Result logout() {
        response().discardCookie("sessionid");
        flash("success_msg", "ログアウトしました");
        return redirect("/");
    }


}