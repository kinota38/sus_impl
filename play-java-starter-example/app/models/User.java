package models;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.*;
import play.data.validation.Constraints;
import play.data.format.Formats;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class User extends Model{

    /**
     * ユーザID
     */
    @Id
    @GeneratedValue
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
     * パスワード
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String password;

    /**
     * salt
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String salt;


    /**
     * セッションID
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String sessionid;

    /**
     * 高校の地域
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String highscool_area;

    /**
     * 高校名
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String highscool;

    /**
     * 志望校の地域
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String uni_area;

    /**
     * 志望校名
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String university;

    /**
     * 学部名
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String major;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    public List<Grade> grade;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    public List<AccGrade> acc_grade;


    public User(final String name, final String password, final String salt,
                final String highscool_area, final String highscool ,
                final String uni_area,final String university,
                final String major) {
        this.username = name;
        this.password = password;
        this.salt = salt;
        this.highscool = highscool;
        this.highscool_area = highscool_area;
        this.university = university;
        this.uni_area = uni_area;
        this.major = major;
    }

    /**
     * モデル保存時に更新日時を更新
     */
    @Override
    public void save() {
        super.save();
    }
}






