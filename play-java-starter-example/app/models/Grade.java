package models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.*;
import play.data.format.Formats;
import play.data.validation.Constraints;
import java.util.List;

@Entity
@Table(name="Grade")
public class Grade extends Model{


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
    public int nowGrade;

    @JsonManagedReference
    @ManyToOne
    public User user;


    public Grade(final String username, final String subject, final int nowGrade) {
        this.username = username;
        this.subject = subject;
        this.nowGrade = nowGrade;
    }

}
