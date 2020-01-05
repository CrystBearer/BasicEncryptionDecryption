import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
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
        createMenuBar();
        createSideBar();
        createMainWindow(primaryStage);
//        for(Menu s: menuBar.getMenus()){
//            System.out.println(s.getText()); // Gets the name of the menu
//        }
    }

    /**
     * Creates the main window of the application
     * @param primaryStage
     */
    public void createMainWindow(Stage primaryStage) {
        VBox vbox = new VBox(menuBar);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cryption");
        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.setX(50);
        primaryStage.setY(50);
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);
        primaryStage.show();
    }

    /**
     * Instantiates the menu bar of the application
     */
    public void createMenuBar() {
        Menu menuFile = new Menu("File");
        MenuItem open = new MenuItem("Open File");
        MenuItem save = new MenuItem("Save");
        MenuItem saveAs = new MenuItem("Save As");
        MenuItem exit = new MenuItem("Exit");
        menuFile.getItems().addAll(open, save, saveAs, exit);

        Menu menuMode = new Menu("Mode");
        toggleMode = new ToggleGroup();
        RadioMenuItem encrypt = new RadioMenuItem("Encrypt");
        RadioMenuItem decrypt = new RadioMenuItem("Decrypt");
        toggleMode.getToggles().addAll(encrypt, decrypt);
        menuMode.getItems().add(encrypt);
        menuMode.getItems().add(decrypt);

        Menu menuAlgo = new Menu("Cipher");
        toggleCiphers = new ToggleGroup();
        RadioMenuItem baconCipher = new RadioMenuItem("Baconian");
        RadioMenuItem caesarCipher = new RadioMenuItem("Caesar");
        toggleCiphers.getToggles().addAll(baconCipher,caesarCipher);
        menuAlgo.getItems().add(baconCipher);
        menuAlgo.getItems().add(caesarCipher);
        menuBar = new MenuBar(menuFile, menuMode, menuAlgo);
    }

    /**
     * Instantiates variables for side bar of files
     */
    public void createSideBar(){

    }


    /**
     * Instantiates variables for file previews
     */
    public void createFilePreview(){

    }

    /**
     * Getter method for Menus
     * @return      main menu bar of the app
     */
    public MenuBar getMenuBar(){
        return menuBar;
    }


    /**
     * Getter method for Modes
     * @return      toggle group for "Modes"
     */
    public ToggleGroup getToggleMode(){
        return toggleMode;
    }


    /**
     * Getter method for ciphers
     * @return      toggle group for "Ciphers"
     */
    public ToggleGroup getToggleCiphers(){
        return toggleCiphers;
    }

    private MenuBar menuBar;
    private ToggleGroup toggleMode;
    private ToggleGroup toggleCiphers;
}
