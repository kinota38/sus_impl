package controllers;

import io.ebean.Ebean;
import models.Event;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

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
        List<Event> result = new ArrayList<>();
        List<Event> entries = Ebean.find(Event.class).findList();
        Optional<User> user = Ebean.find(User.class).where().eq("sessionid",request().cookies().get("sessionid").value()).findOneOrEmpty();
        for (Event entry : entries) {
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

            if(startDate.compareTo(endDate)==1){
                String temp = startDate;
                startDate = endDate;
                endDate = temp;
            }


            final Event newEvent = new Event(username, title);

            newEvent.start_date = sdf.parse(startDate, new ParsePosition(0));
            newEvent.end_date = sdf.parse(endDate, new ParsePosition(0));
            newEvent.color = color;

            newEvent.save();
            System.out.println(newEvent.start_date_string);
            return list();

        } catch(Exception e) {
            return badRequest();
        }
    }

    /**
     * フォームを受け取り，指定したエントリを編集する
     * @return 指定したエントリの変更を保存した後の投稿リスト
     */
    public Result edit(Long id){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        try {
            Event entry = Ebean.find(Event.class).setId(id).findOne();
            if(entry == null) {
                return notFound();
            }
            Map<String, String[]> form = request().body().asFormUrlEncoded();
            entry.title = form.get("title")[0];
            entry.start_date = sdf.parse(form.get("start_date")[0].replaceAll("-","/")
                    .replaceAll("T"," "), new ParsePosition(0));
            entry.end_date = sdf.parse(form.get("end_date")[0].replaceAll("-","/")
                    .replaceAll("T"," "), new ParsePosition(0));
            entry.color = form.get("color")[0];
            entry.update();
            entry.save();
        } catch(Exception e) {
            return badRequest();
        }
        return list();
    }

    /**
     * 特定のエントリのみを返す
     * @param id 返して欲しいエントリのID
     * @return JSON形式でエントリ（あるいは空のJSON）を返す
     */
    public Result fetch(Long id) {
        Event entry = Ebean.find(Event.class).setId(id).findOne();
        if(entry == null) {
            return notFound();
        }
        return ok(Json.toJson(entry));
    }

    /**
     * 特定のエントリを削除する
     * @param id 削除するエントリのID
     * @return 削除後の投稿リスト
     */
    public Result delete(Long id) {
        Ebean.find(Event.class).setId(id).findOneOrEmpty().map(entry -> entry.delete());
        return list();
    }
}
