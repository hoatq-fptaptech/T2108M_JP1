package javafx;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    public Text listView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String txt = "";
        for(Person p : Main.personList){
            txt+= p.toString();
        }
        listView.setText(txt);
    }
}
