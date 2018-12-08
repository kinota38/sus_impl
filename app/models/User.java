package models;


import javax.persistence.*;

import io.ebean.*;
import play.data.validation.Constraints;
import play.data.format.Formats;

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
     * セッションID
     */
    @Constraints.Required
    @Constraints.MaxLength(255)
    @Formats.NonEmpty
    @Column(nullable = true)
    public String sessionid;

    /**
     * コンストラクタ：新規ユーザの登録
     * @param name ユーザの名前
     * @param password ユーザのパスワード
     */
    public User(final String name, final String password) {
        this.username = name;
        this.password = password;

    }

    /**
     * モデル保存時に更新日時を更新
     */
    @Override
    public void save() {
        super.save();
    }
}






