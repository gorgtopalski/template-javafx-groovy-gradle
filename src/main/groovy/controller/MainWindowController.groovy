package controller

import groovy.transform.CompileStatic
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label

@CompileStatic
class MainWindowController implements Initializable
{
    @FXML Label label

    @Override
    void initialize(URL location, ResourceBundle resources)
    {
        String userName = System.getProperty('user.name')
        String javaVersion = System.getProperty("java.version")
        String javafxVersion = System.getProperty("javafx.version")

        label.setText("Hello $userName!\n\nYou are running JavaFx $javafxVersion on Java $javaVersion")
    }
}
