package JefXif;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Matthew
 */
public abstract class GUI{
    public static String Path;
    
    public static FXMLLoader Loader = new FXMLLoader();
    
    

    public void initialize(Stage stage, String title) throws Exception {
        stage.setTitle(title);
// Creates the scene and loads the main pane
        stage.setScene(createScene(loadMainPane()));

        stage.show();
    }

    /**
     * Loads the main fxml layout. Sets up the window switching Window Class.
     * Loads the first window into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    public abstract Pane loadMainPane() throws IOException;

    /**
     * Creates the main application scene.
     *
     * @param mainPane the main application layout.
     *
     * @return the created scene.
     */
    public Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
//Uncomment if using a stylesheet        
//        scene.getStylesheets().setAll(getClass().getResource("vista.css").toExternalForm());
        return scene;
    }
}
