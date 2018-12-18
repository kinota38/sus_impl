package controllers;

import io.ebean.Ebean;
import play.libs.Json;
import play.mvc.*;
import views.html.section.calendar.*;
import views.html.section.grades.*;
import views.html.section.*;
import models.User;
import models.Grade;

import java.util.List;

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
        return ok(grades.render());
    }

    public Result calendar(){
        return ok(calendar.render());
    }




}
