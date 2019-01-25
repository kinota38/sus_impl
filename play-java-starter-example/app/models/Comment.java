package models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment extends Model{


    @Id
    @GeneratedValue
    public long id;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public long threadid;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public String comment;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public String imagepath;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public long registeredAt;

    @Constraints.Required
    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String username;

    @Constraints.Required
    @Formats.NonEmpty
    @Column(nullable = false)
    public long anchor;

    @JsonManagedReference
    @ManyToOne
    public Thread thread;

    public Comment(long threadid, String comment, long registeredAt, String username, String path,long anchor){
        this.threadid = threadid;
        this.comment = comment;
        this.registeredAt = registeredAt;
        this.username = username;
        this.imagepath = path;
        this.anchor = anchor;
    }


}






