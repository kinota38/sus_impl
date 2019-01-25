package controllers;

import play.mvc.*;

import views.html.section.todo.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.ebean.Ebean;
import play.libs.Json;
import play.mvc.*;
import org.apache.commons.codec.digest.DigestUtils;

import models.User;
import models.todoTask;

public class TodoController extends Controller{
    public Result todoApplication(){
        String sessionid;
        try {
            sessionid = request().cookies().get("sessionid").value();
        } catch (Exception e) {
            flash("error_msg", "ログインしてください");
            return redirect("/");
        }
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",sessionid).findOneOrEmpty();
        if(user.isPresent()){
            return ok(todo.render(user.get().username));
        }
        flash("error_msg", "ログインしてください");
        return redirect("/");
    }

    public Result taskList() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final String sessionid = form.get("sessionid")[0];
        final int done_active = Integer.parseInt(form.get("done-active")[0]);
        List<todoTask> tasks;
        if(done_active==1){
            tasks = Ebean.find(todoTask.class).where().eq("sessionid", sessionid).eq("done", false).findList();
        }else {
            tasks = Ebean.find(todoTask.class).where().eq("sessionid", sessionid).findList();
        }
        return ok(Json.toJson(tasks));
    }

    public Result analyzeList() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final String sessionid = form.get("sessionid")[0];
        List<todoTask> tasks;
        tasks = Ebean.find(todoTask.class).where().eq("sessionid", sessionid).eq("done", true).findList();
        return ok(Json.toJson(tasks));
    }

    public Result taskDone() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final int id = Integer.parseInt(form.get("id")[0]);
        todoTask task=Ebean.find(todoTask.class).setId(id).findOne();
        task.setDone();
        task.save();
        return taskList();
    }

    public Result newTask() {
        try {
            Map<String, String[]> form = request().body().asFormUrlEncoded();
            final String title = form.get("title")[0];
            final String sessionid = form.get("sessionid")[0];
            if (title.isEmpty()) {
                return notAcceptable("タスク名を入力してください。");
            }
            final String deadline = form.get("deadline")[0];
            final String subject = form.get("subject")[0];
            final todoTask newtask = new todoTask(title, deadline, sessionid,subject);
            newtask.save();
            return taskList();
        } catch (Exception e) {
            return badRequest();
        }
    }

    public Result taskDelete() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final int id = Integer.parseInt(form.get("id")[0]);
        Ebean.find(todoTask.class).setId(id).findOneOrEmpty().map(entry -> entry.delete());
        return taskList();
    }
}
