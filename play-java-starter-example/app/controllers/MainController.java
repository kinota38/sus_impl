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
import views.html.section.calendar.month.calendar;
import views.html.section.calendar.day.*;
import views.html.section.grades.grades;
import views.html.section.section;

import java.util.UUID;
import java.util.Optional;

public class MainController extends Controller {


    public Result mypageForm(String username){
        return ok(section.render(username));
    }

    public Result signOut(){
        response().discardCookie("sessionid");

        return redirect("/");
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result grade(String username){
        return ok(grades.render(username));
    }

    public Result calendarMonth(){
        String sessionid;
        try {
            sessionid = request().cookies().get("sessionid").value();
        } catch (Exception e) {
            return redirect("/");
        }
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",sessionid).findOneOrEmpty();
        if(user.isPresent()){
            return ok(calendar.render(user.get().username));
        }
        return redirect("/");
    }

    public Result calendarDay(){
        String sessionid;
        try {
            sessionid = request().cookies().get("sessionid").value();
        } catch (Exception e) {
            return redirect("/");
        }
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",sessionid).findOneOrEmpty();
        if(user.isPresent()){
            return ok(day.render(user.get().username));
        }
        return redirect("/");
    }


}
