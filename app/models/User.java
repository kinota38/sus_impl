package models;

import javax.persistence.*;
import java.util.ArrayList;
import io.ebean.*;
import play.data.validation.Constraints;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Entity
@Table(name="users")
public class User  extends Model{
    @GeneratedValue
    private long Id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

    @Constraints.Required
    private boolean status; //ログイン状態かどうか

    private ArrayList<Task> taskArrayList;

    public boolean passCheck(String password){
        if(this.password.equals(passParse(password))){
            this.status = true;
            return true;
        }
        return false;
    }

    public boolean getStatus(){
        return status;
    }

    public void logout(){
        this.status = false;
    }

    public void addTask(Task task){
        taskArrayList.add(task);
    }

    public void removeTask(Long id){
        taskArrayList.remove(id);
    }

    public ArrayList getTasks(){
        return taskArrayList;
    }

    public String getName(){
        return name;
    }

    private static String passParse(String password){
        MessageDigest md = null;
        StringBuilder sb;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(password.getBytes());
        sb = new StringBuilder();
        for (byte b : md.digest()) {
            String hex = String.format("%02x", b);
            sb.append(hex);
        }
        return sb.toString();
    }

    public User(String name, String password) {
        this.name = name;
        this.password = passParse(password);
        this.status = false;
        taskArrayList = new ArrayList<>();
    }
}
