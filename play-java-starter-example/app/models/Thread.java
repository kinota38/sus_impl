package models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="thread")
public class Thread extends Model{


    @Id
    @GeneratedValue
    @Column(name = "id")
    public long id;

    /**
     * ユーザ名
     */
    @Constraints.Required
    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String username;

    /**
     * スレッド名
     */
    @Constraints.Required
    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String threadname;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    public List<Comment> comment;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL)
    public List<User> user;

    /**
     * 最終更新日時(ソートしやすくするためミリ秒で保存)
     */
    public long updatedAt;


    public Thread(String username, String threadname, long updatedAt){
        this.username = username;
        this.threadname = threadname;
        this.updatedAt = updatedAt;
    }

    @Override
    public void save() {
        super.save();
    }

}






