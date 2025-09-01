package showhide;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * written by Solomon Ibrayev on 26/08/2025
 */
public class ShowHideApplication extends Application {

    public static void main(String[] args) { launch(args); }


    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ShowHideApplication.class.getResource("showhide-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle(" SHOW | HIDE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
