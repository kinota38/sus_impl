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
    public String subject;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public int nowGrade;

    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public int targetGrade;

    @JsonManagedReference
    @ManyToOne
    public User user;


    public Grade(final String subject, final int targetGrade, final int nowGrade) {
        this.subject = subject;
        this.targetGrade = targetGrade;
        this.nowGrade = nowGrade;
    }

}
