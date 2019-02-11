import groovy.transform.CompileStatic
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

@CompileStatic
class JavaFxApplication extends Application
{
    @Override
    void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource('view/MainWindow.fxml'))

        Scene scene = new Scene(root)
        scene.stylesheets.add(this.getClass().getClassLoader().getResource('style/all.css').toExternalForm())

        stage.setScene(scene)
        stage.setTitle('template-javafx-groovy-gradle')
        stage.show()
    }

    static void main(String... args)
    {
        launch(JavaFxApplication,args)
    }
}
