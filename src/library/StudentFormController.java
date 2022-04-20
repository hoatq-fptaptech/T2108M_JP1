package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

public class StudentFormController {
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "root";

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
            // goi driver
            Class.forName("com.mysql.jdbc.Driver");
            // tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);

            String sql_txt = "";
            if(this.editData == null){
                sql_txt = "insert into Students (studentName,dateOfBirth,address,email,phoneNumber) values(?,?,?,?,?)";
            }else{
                sql_txt = "update Students set studentName= ?,dateOfBirth = ?,address=?,email=?,phoneNumber= ? where id="+this.editData.getId();
            }
            PreparedStatement stt = conn.prepareStatement(sql_txt);
            stt.setString(1,name);
            stt.setString(2,birthday);
            stt.setString(3,address);
            stt.setString(4,email);
            stt.setString(5,phone);
            stt.execute();

            this.backStudents();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
