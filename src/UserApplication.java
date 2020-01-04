import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UserApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("HI");
        VBox vBox = new VBox(label);
        Scene scene = new Scene(vBox);
        primaryStage.setTitle("Cryption");
        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.setScene(scene);
        primaryStage.setX(50);
        primaryStage.setY(50);
        primaryStage.setWidth(600);
        primaryStage.show();
    }
}
