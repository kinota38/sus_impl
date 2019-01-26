package models;

import io.ebean.annotation.Cache;
import play.data.format.Formats;
import play.data.validation.Constraints;

import io.ebean.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="event")
public class Event extends Model{

    /**
     * イベントのID
     * 自動生成される
     */
    @Id
    @GeneratedValue
    public long id;

    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(name = "title",nullable = false)
    public String title;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy/MM/dd HH:mm")
    @Formats.NonEmpty
    @Column(name = "start_date", nullable = false)
    public Date start_date;

    @Constraints.Required
    @Formats.DateTime(pattern="yyyy/MM/dd HH:mm")
    @Formats.NonEmpty
    @Column(name = "end_date", nullable = false)
    public Date end_date;

    // 色(デフォルトは青)
    public String color = "#039BE5";


    //-----------jsonでdayを取得する際に面倒なので文字列型に置き換えたものを保持しておく
    //-----------なのでこれは使用しなくても良いです。
    public String start_date_string;
    public String end_date_string;
    //----------------------------------------
    /**
     * タスクの製作者
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(name = "username",nullable = false)
    public String username;

    public Event(String username, String title){
        this.title = title;
        this.username = username;
        start_date = new Date();
        end_date = new Date();

    }

    @Override
    public void save() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        start_date_string = sdf.format(start_date);
        end_date_string = sdf.format(end_date);
        super.save();
    }
}
