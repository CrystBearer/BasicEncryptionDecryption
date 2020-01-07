import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private MenuItem openButton, saveButton, saveAsButton, exitButton;

    @FXML
    private MenuBar menuBar;

    /**
     * Exits the application
     * @param e
     */
    @FXML
    protected void exitMenuAction(ActionEvent e) {
        Stage owner = (Stage) menuBar.getScene().getWindow();
        owner.close();
        return;
    }
}
