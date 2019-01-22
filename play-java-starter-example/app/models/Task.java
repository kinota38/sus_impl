package models;

import io.ebean.annotation.Cache;
import play.data.format.Formats;
import play.data.validation.Constraints;

import io.ebean.*;
import javax.persistence.Column;
import java.util.Calendar;
import java.util.Date;

public class Task extends Model{
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(name = "title",nullable = false)
    public String title;

    @Formats.DateTime(pattern="yyyy/MM/dd")
    @Formats.NonEmpty
    @Column(name = "startDate", nullable = false)
    public Date startDate ;

    @Formats.DateTime(pattern="yyyy/MM/dd")
    @Formats.NonEmpty
    @Column(name = "endDate", nullable = false)
    public Date endDate ;

    /**
     * タスクの製作者
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(name = "username",nullable = false)
    public String username;

    public Task(String username,String title,int []startDate,int []endDate){
        this.title = title;
        this.username = username;
        Calendar carlendar = Calendar.getInstance();
        carlendar.set(startDate[0],startDate[1]-1,startDate[2]);
        this.startDate = carlendar.getTime();
        carlendar.set(endDate[0],endDate[1]-1,endDate[2]);
        this.endDate = carlendar.getTime();
    }

}
