package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static ObservableList<Person> personList = FXCollections.observableArrayList();

    public static Stage rootStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        personList.add(new Person("quang hoa","quanghoa@gmail.com",18));
        personList.add(new Person("nguyen van an","annv@gmail.com",16));
        launch(args);
    }
}
