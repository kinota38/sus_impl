package models;

import javax.persistence.*;

import io.ebean.Model;
import play.data.validation.Constraints;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="tasks")
public class todoTask extends Model {
    /**
     * タスクのID
     * 自動生成される
     */
    @Id
    @GeneratedValue
    public long id;

    /**
     * タスクのタイトル
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String title;

    /**
     * セッションID
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String sessionid;

    /**
     * タスク完了状態
     */
    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public boolean done = false;

    /**
     * 教科の種類
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String subject;

    /**
     * タスク登録タイムスタンプ
     * 作成時に自動的に初期化される
     */
    @Formats.DateTime(pattern="yyyy/MM/dd HH:mm:ss")
    @Formats.NonEmpty
    @Column(name = "registered_at", nullable = false)
    public Date registeredAt = new Date();

    /**
     * タスク締め切り
     */
    @Formats.DateTime(pattern="yyyy/MM/dd")
    @Formats.NonEmpty
    @Column(name = "deadline", nullable = false)
    public Date deadline = new Date();


    /**
     * タスクの作成
     * @param title タイトルは必須
     */
    public todoTask(String title,String deadline,String sessionid,String subject) {
        this.title = title;
        this.subject=subject;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.deadline = sdf.parse(deadline);
        } catch(ParseException e) {
        }
        this.sessionid= sessionid;
    }

    public void setDone() {
        this.done = !this.done;
    }
}
