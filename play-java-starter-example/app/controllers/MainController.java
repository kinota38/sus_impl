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

public class MainController extends Controller {


    public Result mypageForm(String username){
        String name = username + "さん";
        String sessionid = request().cookies().get("sessionid").value();
        return ok(section.render(name));
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
    public Result grade(){
        return ok(grades.render());
    }

    public Result calendarMonth(){
        return ok(calendar.render());
    }

    public Result calendarDay(){
        return ok(day.render());
    }


}
