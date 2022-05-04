package library;

import database.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentFormController implements Initializable {

    public TextField sName;
    public TextField sEmail;
    public TextField sPhone;
    public TextField sBirthday;
    public TextArea sAddress;
    public ComboBox<Student> sGender;
    public Student editData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        ObservableList<String> ls = FXCollections.observableArrayList("Male","Female","Other");
//        sGender.setItems(ls);
        StudentRepository sr = new StudentRepository();
        ArrayList<Student> ls = sr.list();
        ObservableList<Student> cblist = FXCollections.observableArrayList();
        cblist.addAll(ls);
        sGender.setItems(cblist);

        // truyen gia tri hien thi ban dau
//        sGender.setValue(cblist.get(1));

    }

    public void setEditData(Student editData){
        this.editData = editData;

        this.sName.setText(editData.getStudentName());
        this.sEmail.setText(editData.getEmail());
        this.sPhone.setText(editData.getPhoneNumber());
        this.sBirthday.setText(editData.getDateOfBirth().toString());
        this.sAddress.setText(editData.getAddress());
        // gia sua khoa ngoai 2;
        for(int i=0;i<this.sGender.getItems().size();i++){
            if(this.sGender.getItems().get(i).getId() == 2){
                sGender.setValue(this.sGender.getItems().get(i));
                break;
            }
        }
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
        // sinh vien duoc chon
        Student selectedStudent = sGender.getSelectionModel().getSelectedItem();
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
