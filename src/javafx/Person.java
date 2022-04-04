package javafx;

import com.sun.deploy.util.FXLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public final class Person {
    public String fullname;
    public String email;
    public Integer age;
    public Button edit;

    public Person() {
    }

    public Person(String fullname, String email, Integer age) {
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event->{
            try{
//                FXLoader loader = new FXLoader().getClass().getResource("form.fxml");
//                Parent root = loader.load();
                Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
                Main.rootStage.setScene(new Scene(root,800,600));
            }catch (Exception e){

            }
            // xoa ai?
//            Main.personList.remove(this);
        });
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public String toString(){
        String s = "\n-------------";
        s+= "\n"+getFullname();
        s+= "\n"+getEmail();
        s+= "\n"+getAge();
        return s;
    }
}
