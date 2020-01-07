import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * Creates the viewable window for users
 */
public class UserApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Instantiates the menubar
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        createMainWindow(primaryStage);
    }



    /**
     * Creates the main window of the application
     * @param primaryStage
     */
    private void createMainWindow(Stage primaryStage) {
        int width = 600;
        int height = 400;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
            Parent root = loader.load();
            myController = loader.getController();
            myData = new Model(myController);
            myController.setModel(myData);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Could not load file!");
        }
        primaryStage.setTitle("Cryption");
        primaryStage.initStyle(StageStyle.UNIFIED);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((screenBounds.getWidth() - width)/ 2);
        primaryStage.setY((screenBounds.getHeight() - height)/ 2);
        primaryStage.show();
    }



    /**
     * Getter method for Controller
     * @return      Controller for app laoded with fxml
     */
    public Controller getMyController(){
        return myController;
    }



    /**
     * Getter method for Model
     * @return      Model for app laoded with fxml
     */
    public Model getMyData(){
        return myData;
    }

    private Controller myController;
    private Model myData;
}
