package controllers;

import io.ebean.Ebean;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.section.calendar.month.calendar;
import models.Task;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class EventController extends Controller {

    /**
     * あるユーザーの全てのエントリーを返す
     * @return JSON形式のエントリーリスト
     */
    public Result list() {
        List<Task> result = new ArrayList<>();
        List<Task> entries = Ebean.find(Task.class).findList();
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",request().cookies().get("sessionid").value()).findOneOrEmpty();
        for (Task entry : entries) {
            if(user.isPresent() && entry.username.equals(user.get().username)){
                result.add(entry);
            }
        }
        System.out.println(entries); // for debug
        System.out.println(result); // for debug
        return ok(Json.toJson(result));
    }

    public Result eventRegister(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            String title = request.get("title")[0];
            String username = request.get("username")[0];
            String startDate = request.get("start_date")[0];
            String endDate = request.get("end_date")[0];
            String color = request.get("color")[0];
            startDate = startDate.replaceAll("-","/");
            startDate = startDate.replaceAll("T"," ");
            endDate = endDate.replaceAll("-","/");
            endDate = endDate.replaceAll("T"," ");

            final Task newTask = new Task(username, title);

            newTask.start_date = sdf.parse(startDate, new ParsePosition(0));
            newTask.end_date = sdf.parse(endDate, new ParsePosition(0));
            newTask.color = color;

            newTask.save();
            System.out.println(newTask.start_date_string);
            return ok(Json.toJson(newTask));

        } catch(Exception e) {

            return badRequest();
        }
    }
}
