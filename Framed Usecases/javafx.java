/*Write a JavaFX program to simulate course registration in Fully Flexible Credit System(FFCS) showing all the subjects in student login that are successfully registered. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class sub extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ListView<String> subjects = new ListView<String>();
        subjects.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        subjects.getItems().add("English");
        subjects.getItems().add("Physics");
        subjects.getItems().add("Java");
        subjects.getItems().add("DBMS");
        subjects.getItems().add("JAVA");
        subjects.getItems().add("Internet of Things");

        HBox root = new HBox(subjects);
        Scene sc = new Scene(root);
        primaryStage.setTitle("Semester Subjects");
        primaryStage.setScene(sc);  
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
