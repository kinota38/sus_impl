package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.section.calendar.month.calendar;
import models.Task;
import java.util.Map;

public class TaskController extends Controller {

    public Result taskRegister(){
        final Map<String, String[]> request = request().body().asFormUrlEncoded();
        String title = request.get("title")[0];
        String username = request.get("username")[0];
        String startDate = request.get("startDate")[0];
        String endDate = request.get("endDate")[0];
        final String startDateSplit[] = startDate.split("-",0);
        final String endDateSplit[] = endDate.split("-",0);
        final int []start={Integer.parseInt(startDateSplit[0]),Integer.parseInt(startDateSplit[1]),Integer.parseInt(startDateSplit[2])};
        final int []end={Integer.parseInt(endDateSplit[0]),Integer.parseInt(endDateSplit[1]),Integer.parseInt(endDateSplit[2])};
        final Task newTask = new Task(username,title,start,end);
        newTask.save();
        return ok(calendar.render());
    }
}
