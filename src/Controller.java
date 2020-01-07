import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

/**
 * Controller class for the UserApplication Class, Model Class, and app.fxml
 */
public class Controller {

    /**
     * Sets the data model
     * @param data
     */
    protected void setModel(Model data){
        myData = data;
    }


    /**
     * Writes to the text area with the given file content
     * @param fileContent
     */
    protected void writeToTextArea(String fileContent){
        textAreaContent.clear();
        textAreaContent.setText(fileContent);
    }



    /**
     * Handles the "Open" and the "Add File" option
     * @param e
     */
    @FXML
    protected void openMenuAction(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().addAll(
          new FileChooser.ExtensionFilter("Text Files", "*.txt", "*.docx")
        );
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if(selectedFile != null){
            myData.setFile(selectedFile);
        }
    }



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

    private Model myData;
    @FXML
    private TextArea textAreaContent;
    @FXML
    private MenuItem openButton, saveButton, saveAsButton, exitButton;
    @FXML
    private MenuBar menuBar;
}
