package javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public Text errMsg;
    public TextField fullName;
    public TextField email;
    public TextField age;

    public void submit(){
//        String s = "\n------------------";
//        s+= "\n"+fullName.getText();
//        s+= "\n"+email.getText();
//        s+= "\n"+age.getText();
//
        try{
            Person p = new Person(fullName.getText(),
                    email.getText(),Integer.parseInt(age.getText()));
            Main.personList.add(p);

            //renderList();
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));

            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }

    }

    private void renderList(){
        String txt = "Infomation\n";
        for(Person p : Main.personList){
            txt+= p.toString();
        }
        result.setText(txt);

        fullName.setText("");
        email.setText("");
        age.setText("");
    }
}
