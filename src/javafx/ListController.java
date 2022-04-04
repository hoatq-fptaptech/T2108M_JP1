package javafx;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
//    public Text listView;
    public TableView<Person> tbView;
    public TableColumn<Person,String> cName;
    public TableColumn<Person,String> cEmail;
    public TableColumn<Person,Integer> cAge;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<Person,String>("fullname"));
        cEmail.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));
        cAge.setCellValueFactory(new PropertyValueFactory<Person,Integer>("age"));
        tbView.setItems(Main.personList);
    }

    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
