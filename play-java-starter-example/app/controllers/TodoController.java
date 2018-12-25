package controllers;

import play.mvc.Result;
import play.mvc.*;
import views.html.section.todo.todo;

public class TodoController extends Controller{
    public Result todoTop() {
        return ok(todo.render());
    }

    public Result tasklist() {
        System.out.println("done tasklist");
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        final String username = form.get("username")[0];
        final int done_active = Integer.parseInt(form.get("done-active")[0]);
        List<Task> tasks;
        if(done_active==1){
            tasks = Ebean.find(Task.class).where().eq("username", username).eq("done", false).findList();
        }else {
            tasks = Ebean.find(Task.class).where().eq("username", username).findList();
        }
        return ok(Json.toJson(tasks));
    }

    public Result newtask() {
        try {
            Map<String, String[]> form = request().body().asFormUrlEncoded();
            final String title = form.get("title")[0];
            final String username= form.get("username")[0];
            if(title.isEmpty()){
                return notAcceptable("タスク名を入力してください。");
            }
            final String deadline = form.get("deadline")[0];
            final Task newtask = new Task(title, deadline,username);
            newtask.save();
            return tasklist();
        } catch(Exception e) {
            return badRequest();
        }
    }
}
