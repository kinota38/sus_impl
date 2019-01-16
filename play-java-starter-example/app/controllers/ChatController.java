package controllers;

import io.ebean.Ebean;
import models.User;
import models.Comment;
import models.Thread;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.section.chat.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ChatController extends Controller {

    //最終更新日時が新しい順にスレッドリストを返す
    public Result threadListRecent() {
        List<Thread> thread = Ebean.find(Thread.class).orderBy("updatedAt desc").findList();
        return ok(Json.toJson(thread));
    }

    public Result threadInfo(Long threadid){
        Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
        return ok(Json.toJson(thread));
    }

    public Result myThreadList(String username){
        List<Thread> thread = Ebean.find(Thread.class).where().eq("username",username).findList();
        return ok(Json.toJson(thread));
    }

    public Result favThreadList(String username){
        User user = Ebean.find(User.class).where().eq("username",username).findOne();
        return ok(Json.toJson(user.favthread));
    }

    public Result chattopForm(String username){
        return ok(chat_top.render(username));
    }

    public Result chatpageForm(String name){
        String[] value = name.split("/");
        String username = value[0];
        long threadid = Long.parseLong(value[1]);
        Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
        List<Comment> comments = thread.comment;
        return ok(chat_page.render(thread.id,comments,username));
    }


    public Result createThread(){
        Ebean.beginTransaction();
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            String threadname = request.get("threadname")[0];
            String username = request.get("username")[0];
            User user = Ebean.find(User.class).where().eq("username",username).findOne();
            Date date = new Date();
            final Thread thread = new Thread(username,threadname,date.getTime());
            thread.save();
            Ebean.commitTransaction();
            return threadListRecent();
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }finally {
            Ebean.endTransaction();
        }
    }


    public Result addComment(){
        Ebean.beginTransaction();
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            Long threadid = Long.parseLong(request.get("threadid")[0]);
            String username = request.get("username")[0];
            String comment = request.get("comment")[0];
            Date date = new Date();
            final Comment entry = new Comment(threadid,comment, date.getTime(),username);
            Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
            entry.thread = thread;
            entry.save();
            Ebean.commitTransaction();
            return ok(Json.toJson(entry));
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }finally {
            Ebean.endTransaction();
        }
    }

    public Result addToFav(String name){
        String[] value = name.split("/");
        String username = value[0];
        long threadid = Long.parseLong(value[1]);
        Ebean.beginTransaction();
        try {
            User user = Ebean.find(User.class).where().eq("username",username).findOne();
            Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
            thread.user.add(user);
            thread.save();
            Ebean.commitTransaction();
            return ok(Json.toJson(thread));
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }finally {
            Ebean.endTransaction();
        }
    }


}
