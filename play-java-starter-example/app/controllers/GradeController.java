package controllers;

import io.ebean.Ebean;
import models.User;
import models.Grade;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class GradeController extends Controller {
    //成績のデータを返す
    public Result gradeList(String username) {
        User user = Ebean.find(User.class).where().eq("username",username).findOne();
        return ok(Json.toJson(user.grade));
    }

    public Result registerGrade() {
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            // モデル更新
            String username = request.get("hidden-username")[0];
            User user = Ebean.find(User.class).where().eq("username",username).findOne();
            String subject = request.get("register-subject")[0];
            int target = Integer.parseInt(request.get("register-target")[0]);
            int now = Integer.parseInt(request.get("register-now")[0]);
            final Grade entry = new Grade(subject,target,now);
            entry.user = user;
            entry.save();
            return gradeList(username);
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }
    }

    public Result editGrade() {
        try {
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            // モデル更新
            String username = request.get("username")[0];
            User user = Ebean.find(User.class).where().eq("username",username).findOne();
            int now_or_target = Integer.parseInt(request.get("now_or_target")[0]);
            int index = Integer.parseInt(request.get("index")[0]);
            int new_grade = Integer.parseInt(request.get("new-grade")[0]);
            if(now_or_target==0){//現在を更新
                user.grade.get(index).nowGrade = new_grade;
            }else if(now_or_target==1){//目標を更新
                user.grade.get(index).targetGrade = new_grade;
            }
            user.save();
            return gradeList(username);
        } catch (Exception e) {
            System.out.println(e);
            return badRequest();
        }
    }

}
