package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.ebean.Ebean;
import play.mvc.*;

import models.Task;
import models.User;
import views.html.sample.todolist.*;


/**
 * Play版アンケートフォーム
 */
public class TodoListController extends Controller {

    private static final String titleLabel = "title";

    /* ***** 課題1の内容（セッション方式）***** */
    /**
     * アンケートの開始
     * @return 初期画面
     */
    public Result startRegistration() {
        // `200 OK`ステータスで初期画面を返す（リクエストヘッダなどは`ok`メソッドが自動で記述してくれる）
        String username = request().body().asFormUrlEncoded().get("username")[0];
        return ok(start.render(username));
    }

    public Result titleForm(){
        String username = request().body().asFormUrlEncoded().get("username")[0];
        return ok(titleForm.render(username));
    }

    /**
     * 名前入力を受け取り，感想入力に処理をすすめる
     * @return 感想入力画面
     */
    public Result handleTitleForm() {
        final String title = request().body().asFormUrlEncoded().get(titleLabel)[0];
        String username = request().body().asFormUrlEncoded().get("username")[0];
        if(title == null) {
            return notAcceptable("タスク名入力に誤りがあります");
        }
        session(titleLabel, title);
        return ok(confirm.render(title,username));
    }


    /**
     * 投稿内容を保存し完了画面を表示
     * @return 完了画面
     */
    /*public Result save() {
        // セッションから情報を取り出す
        final String title = session(titleLabel);
        // モデルを構築し，DBに保存
        final Task newEntry = new Task(title);
        newEntry.save();


        // セッション情報をクリアし，完了画面を返す
        session().clear();
        return ok(complete.render(newEntry));
    }*/
    public Result save() {
        // セッションから情報を取り出す

        // モデルを構築し，DBに保存
        final Map<String, String[]> request = request().body().asFormUrlEncoded();
        final String title = request.get(titleLabel)[0];
        String username = request().body().asFormUrlEncoded().get("username")[0];
        final Task newEntry = new Task(title,username);
        newEntry.save();

        // セッション情報をクリアし，完了画面を返す
        return ok(complete.render(newEntry,username));
    }

    public Result login(){
        return ok(login.render());
    }
    public Result loginHandle(){
        final Map<String, String[]> request = request().body().asFormUrlEncoded();
        String username = request.get("username")[0];
        String password = request.get("password")[0];
        List<User> users = Ebean.find(User.class).findList();
        if(users == null)redirect("/");
        for(User user: users){
            if(user.passCheck(password)){
                return redirect("/index/"+username);
            }
        }
        return redirect("/");
    }

    /* ***** おまけ：Playサンプル ***** */
    /**
     * トップページにDBに保存されているアンケートを一括表示
     * @return 投稿済みアンケートのリスト
     */
    /*public Result index() {
        final List<Task> entries = Ebean.find(Task.class).findList();
        return ok(index.render(entries));
    }*/

    public Result index(String name) {
        final List<Task> entries = Ebean.find(Task.class).findList();

        //final List<Task> entries = Ebean.find(Task.class).findList();
        return ok(index.render(entries,name));
    }
    public Result index2() {
        final List<Task> entries = Ebean.find(Task.class).findList();
        final Map<String, String[]> request = request().body().asFormUrlEncoded();
        String name = request.get("username")[0];
        if(request.get("express_way")[0].equals("regular")) {
            return ok(index.render(entries,name));
        }else{
            return ok(index2.render(entries));
        }
    }

    /**
     * 指定されたIDのアンケートを表示
     * @param id 表示するアンケートのID
     * @return アンケート表示画面
     */
    public Result entry(Long id) {
        final Task targetEntry = Ebean.find(Task.class).setId(id).findOne();
        if (targetEntry == null) {
            return notFound("Not found: entry #" + id);
        }
        return ok(entry.render(targetEntry));
    }

    public Result userRegister(){
        return ok(userRegister.render());
    }

    public Result userRegisterHandle(){
        final Map<String, String[]> request = request().body().asFormUrlEncoded();
        String username = request.get("username")[0];
        String password = request.get("password")[0];
        final User user = new User(username,password);
        user.save();
        return redirect("/");
    }

    /**
     * 指定されたIDのアンケートの編集画面を表示
     * @param id 編集するアンケートのID
     * @return アンケート編集画面
     */
    public Result edit(Long id) {
        final Task targetEntry = Ebean.find(Task.class).setId(id).findOne();
        if(targetEntry == null) {
            return notFound("Not found: entry #" + id);
        }
        session("id", Long.toString(targetEntry.id));
        return ok(edit.render(targetEntry));
    }

    /**
     * アンケートのアップデート
     * @return 投稿済みアンケートのリスト
     */
    public Result update() {
        // モデル更新にはトランザクションを利用する
        Ebean.beginTransaction();
        try {
            // 更新するモデルの取得
            final Long id = Long.parseLong(session("id"));
            final Task targetEntry = Ebean.find(Task.class).setId(id).findOne();
            // 編集されたパラメータの取得
            final Map<String, String[]> request = request().body().asFormUrlEncoded();
            // モデル更新
            targetEntry.title = request.get("title")[0];
            targetEntry.done  = request.get("done")[0].equals("finish");
            targetEntry.save();
            // トランザクションをコミット
            Ebean.commitTransaction();
        } catch(NullPointerException npe) {
            return notAcceptable();
        } finally {
            // トランザクションを終了
            Ebean.endTransaction();
        }
        session().clear();
        return redirect("/");
    }

    /**
     * 指定されたIDのアンケートを削除
     * @param id 削除するアンケートのID
     * @return 一覧表示画面
     */
    public Result delete(Long id) {
        // `findOne`だとnullに対しdelete()を呼ぶ場合があるため，`findOneOrEmpty`でOptionalとして操作する
        Ebean.find(Task.class).setId(id).findOneOrEmpty().map(entry -> entry.delete());
        return redirect("/");
    }

}
