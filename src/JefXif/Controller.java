package JefXif;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 * 
 * @author Matthew
 */
public abstract class Controller implements Initializable {
    
    private String path;
    
    private ArrayList<WindowController>windows;
    
    @FXML
    private Pane mainPane;
    
    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void swapWindow(Node node) {
        this.mainPane.getChildren().set(0, node);
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public abstract void initialize(URL url, ResourceBundle rb);    

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the mainPane
     */
    public Pane getMainPane() {
        return mainPane;
    }

    /**
     * @param mainPane the mainPane to set
     */
    public void setMainPane(Pane mainPane) {
        this.mainPane = mainPane;
    }

    /**
     * @return the windows
     */
    public ArrayList<WindowController> getWindows() {
        return windows;
    }

    /**
     * @param windows the windows to set
     */
    public void setWindows(ArrayList<WindowController> windows) {
        this.windows = windows;
    }
    
}
