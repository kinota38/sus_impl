package controllers;

import com.google.common.io.Files;
import io.ebean.Ebean;
import models.User;
import models.Comment;
import models.Thread;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import views.html.section.chat.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import java.io.File;
import java.util.regex.Pattern;

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
        User user = Ebean.find(User.class).where().eq("username",username).findOne();
        for(Thread t:user.favthread){
            if(t.id==threadid){
                return ok(chat_page.render(thread.id,comments,username,1));
            }
        }

        return ok(chat_page.render(thread.id,comments,username,0));
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

    public Result search(String keyword){
        Pattern p = Pattern.compile("[\\s]+");
        String[] keys = p.split(keyword);
        List<Thread> entry = new ArrayList<>();
        List<Thread> threads = Ebean.find(Thread.class).findList();
        for(Thread thread:threads){
            for(String key:keys){
                if(thread.threadname.contains(key)){
                    entry.add(thread);
                    break;
                }
            }
        }
        return ok(Json.toJson(entry));
    }





    public Result addComment(){
        Ebean.beginTransaction();
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            Long threadid = Long.parseLong(request.get("threadid")[0]);
            String username = request.get("username")[0];
            String comment = request.get("comment")[0];
            Date date = new Date();
            final Comment entry = new Comment(threadid,comment, date.getTime(),username,"なし");
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
            for(int t=0;t<user.favthread.size();t++){
                if(user.favthread.get(t).id==threadid){
                    user.favthread.get(t).user.remove(user);
                    user.favthread.get(t).save();
                    user.favthread.remove(t);
                    user.save();
                    Ebean.commitTransaction();
                    return ok();
                }
            }
            Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
            thread.user.add(user);
            thread.save();
            Ebean.commitTransaction();
            return ok();
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }finally {
            Ebean.endTransaction();
        }
    }


    public Result addpicture(){
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");
        final Map<String, String[]> data = body.asFormUrlEncoded();
        String username = data.get("username")[0];
        Long threadid = Long.parseLong(data.get("threadid")[0]);
        Ebean.beginTransaction();
        if (picture != null) {

            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            try {
                String path = "thread/"+threadid;
                File file = picture.getFile();
                File dir = new File("./private/"+path);
                dir.mkdir();
                File file2 = new File("./private/"+path+"/"+fileName);
                if(file2.createNewFile()) {
                    Files.copy(file,file2);
                }
                Date date = new Date();
                Comment entry = new Comment(threadid,"", date.getTime(),username,"/assets2/"+path+"/"+fileName);
                Thread thread = Ebean.find(Thread.class).where().eq("id",threadid).findOne();
                entry.thread = thread;
                entry.save();
                Ebean.commitTransaction();

                return ok(Json.toJson(entry));
            }catch (Exception e){
                System.out.println(e);
            }finally {
                Ebean.endTransaction();
            }
        } else {
            flash("error", "Missing file");
            return badRequest();
        }
        return badRequest();
    }

}
