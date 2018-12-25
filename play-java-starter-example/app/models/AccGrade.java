package models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.*;
import play.data.format.Formats;
import play.data.validation.Constraints;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="AccGrade")
public class AccGrade extends Model{


    @Id
    @GeneratedValue
    public long id;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String username;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String subject;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public int accGrade;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String tag;

    @JsonManagedReference
    @ManyToOne
    public User user;

    /**
     * 投稿日時(ソートしやすくするためミリ秒で保存)
     */
    public Long registeredAt;

    public AccGrade(final String username, final String subject, final int accGrade,final String tag, final Long registerAt) {
        this.username = username;
        this.subject = subject;
        this.accGrade = accGrade;
        this.tag = tag;
        this.registeredAt = registerAt;
    }

}
