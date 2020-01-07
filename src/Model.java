import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 * Model class for the UserApplication Class, Controller Class, and app.fxml
 */
public class Model {

    /**
     * Instantiates the Model class
     * @param myController
     */
    public Model(Controller myController){
        this.myController = myController;
    }



    /**
     * Sets the controller to the private variable in Model class
     * @param myController
     * @return
     */
    protected void setController(Controller myController){
        this.myController = myController;
    }



    /**
     * Set the current viewable File
     * @param current
     */
    protected void setFile(File current){
        currentFile = current;
        originalFileContent = "";
        String filePath = currentFile.getAbsolutePath();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while(br.ready()){
                originalFileContent += Character.toString(br.read());
            }
            br.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        myController.writeToTextArea(originalFileContent);
    }



    /**
     * Returns the currently viewable original file content
     * @return String file content of currently viewed file
     */
    protected String getOriginalFileContent(){
        return originalFileContent;
    }

    private String originalFileContent;
    private File currentFile;
    private Controller myController;
}
