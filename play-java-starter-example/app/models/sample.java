package models;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.Formats;
import play.data.validation.Constraints;
import java.util.List;

@Entity
@Table(name="sample")
public class sample extends Model{


    @Id
    @GeneratedValue
    public long id;


    @Constraints.MaxLength(25)
    @Formats.NonEmpty
    @Column(nullable = false)
    public String message;


   @ManyToOne(cascade = CascadeType.ALL)
   public User user;


    public sample(final String message) {
        this.message = message;
    }

    /**
     * モデル保存時に更新日時を更新
     */
    @Override
    public void save() {
        super.save();
    }
}
