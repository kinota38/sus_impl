package models;

import java.util.Date;
import javax.persistence.*;

import io.ebean.*;
import play.data.validation.Constraints;
import play.data.format.Formats;


/**
 * TODOリスト用タスクモデル
 */
@Entity
@Table(name="tasks")
public class Task extends Model {


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
    @Column(name = "title",nullable = false)
    public String title;

    /**
     * タスクの製作者
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(name = "name",nullable = false)
    public String name;

    /**
     * タスク完了状態
     */
    @Constraints.Required
    @Formats.NonEmpty
    @Column(name = "done" , nullable = false)
    public boolean done = false;

    /**
     * タスク登録タイムスタンプ
     * 作成時に自動的に初期化される
     */
    @Formats.DateTime(pattern="yyyy/MM/dd HH:mm:ss")
    @Formats.NonEmpty
    @Column(name = "registered_at", nullable = false)
    public Date registered_at = new Date();


    /**
     * 更新日時
     */
    @Formats.DateTime(pattern="yyyy/MM/dd HH:mm:ss")
    @Formats.NonEmpty
    @Column(name = "updated_at", nullable = false)
    public Date updated_at = null;

    /**
     * タスクの作成
     * @param title タイトルは必須
     */
    public Task(String title,String name) {
        this.title = title;
        registered_at = new Date();
        done = false;
        this.name = name;
    }

    /**
     * モデル保存時に更新日時を更新
     */
    @Override
    public void save() {
        updated_at = (updated_at == null ? registered_at : new Date());
        super.save();
    }
}
