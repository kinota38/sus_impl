package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.section.calendar.month.calendar;
import models.Task;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Map;
import java.text.SimpleDateFormat;

public class TaskController extends Controller {

    public Result eventRegister(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            String title = request.get("title")[0];
            String username = request.get("username")[0];
            String startDate = request.get("start_date")[0];
            String endDate = request.get("end_date")[0];
            String startTime = request.get("start_time")[0];
            String endTime = request.get("end_time")[0];

            final Task newTask = new Task(username, title);


            newTask.start_date = sdf.parse(startDate + " "+startTime, new ParsePosition(0));
            newTask.end_date = sdf.parse(endDate + " " + endTime, new ParsePosition(0));

            //newTask.save();
            return ok(Json.toJson(newTask));
        } catch(Exception e) {
            return badRequest();
        }
    }
}
