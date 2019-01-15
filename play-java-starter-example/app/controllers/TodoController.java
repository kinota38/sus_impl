package controllers;

import play.mvc.*;

import views.html.section.todo.*;

import java.util.List;
import java.util.Map;

import io.ebean.Ebean;
import play.libs.Json;
import play.mvc.*;
import org.apache.commons.codec.digest.DigestUtils;

import models.User;
import models.Task;

public class TodoController extends Controller{
    public Result todoApplication(){
        return ok(todo.render());
    }

    public Result taskList() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final String sessionid = form.get("sessionid")[0];
        final int done_active = Integer.parseInt(form.get("done-active")[0]);
        List<Task> tasks;
        if(done_active==1){
            tasks = Ebean.find(Task.class).where().eq("sessionid", sessionid).eq("done", false).findList();
        }else {
            tasks = Ebean.find(Task.class).where().eq("sessionid", sessionid).findList();
        }
        return ok(Json.toJson(tasks));
    }

    public Result taskDone() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final int id = Integer.parseInt(form.get("id")[0]);
        Task task=Ebean.find(Task.class).setId(id).findOne();
        task.setDone();
        task.save();
        return taskList();
    }

    public Result newTask() {
        try {
            Map<String, String[]> form = request().body().asFormUrlEncoded();
            final String title = form.get("title")[0];
            System.out.println(title);
            final String sessionid = form.get("sessionid")[0];
            System.out.println(sessionid);
            if (title.isEmpty()) {
                return notAcceptable("タスク名を入力してください。");
            }
            final String deadline = form.get("deadline")[0];
            System.out.println(deadline);
            final Task newtask = new Task(title, deadline, sessionid);
            newtask.save();
            return taskList();
        } catch (Exception e) {
            return badRequest();
        }
    }

    public Result taskDelete() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final int id = Integer.parseInt(form.get("id")[0]);
        Ebean.find(Task.class).setId(id).findOneOrEmpty().map(entry -> entry.delete());
        return taskList();
    }
}
