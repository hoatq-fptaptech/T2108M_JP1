package library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    public TableView<Student> tbStudents;
    public TableColumn<Student,String> sName;
    public TableColumn<Student,String> sBirthday;
    public TableColumn<Student,String> sAddress;
    public TableColumn<Student,String> sEmail;
    public TableColumn<Student,String> sPhone;
    public TableColumn<Student, Button> sAction;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        sBirthday.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        sAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        sEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        sPhone.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        sAction.setCellValueFactory(new PropertyValueFactory<>("editBtn"));

        // get data from mysql
        try {

            // truy van sql
            String txt_sql = "select * from Students";
            Connector conn = new Connector();
            PreparedStatement stt = conn.getStatement(txt_sql);
            ResultSet rs = stt.executeQuery();

            ObservableList<Student> list = FXCollections.observableArrayList();
            while (rs.next()){
                Student s = new Student(
                            rs.getInt("id"),
                            rs.getString("studentName"),
                            Date.valueOf(rs.getString("dateOfBirth")),
                            rs.getString("address"),
                            rs.getString("email"),
                            rs.getString("phoneNumber")
                            );
                list.add(s);
            }
            tbStudents.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void backHome(ActionEvent event)  throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void addStudent(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("studentForm.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
