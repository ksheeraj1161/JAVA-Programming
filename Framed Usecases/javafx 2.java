/*17.	Create a dropdown for Selecting date in codetantra to view answer scripts staring from the selected date. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class q3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        DatePicker d = new DatePicker();
        Label lbl = new Label("Select Date");
        HBox root = new HBox();
        root.getChildren().addAll(lbl, d);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Answer Scripts");
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
