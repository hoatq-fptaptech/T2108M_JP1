package library;

import database.Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Date;

public class StudentFormController {

    public TextField sName;
    public TextField sEmail;
    public TextField sPhone;
    public TextField sBirthday;
    public TextArea sAddress;

    public Student editData;

    public void setEditData(Student editData){
        this.editData = editData;

        this.sName.setText(editData.getStudentName());
        this.sEmail.setText(editData.getEmail());
        this.sPhone.setText(editData.getPhoneNumber());
        this.sBirthday.setText(editData.getDateOfBirth().toString());
        this.sAddress.setText(editData.getAddress());
    }

    public void backStudents() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("students.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }


    public void submit(ActionEvent event) {
        String name = this.sName.getText();
        String email = this.sEmail.getText();
        String phone = this.sPhone.getText();
        String birthday = this.sBirthday.getText();
        String address = this.sAddress.getText();
        try {
            StudentRepository sr = new StudentRepository();
            if(this.editData == null) {
                Student s = new Student(null,name,Date.valueOf(birthday),address,email,phone);
                sr.create(s);
            }else{
                sr.update(this.editData);
            }
            this.backStudents();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
