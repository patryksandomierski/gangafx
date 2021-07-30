package pat.san;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
@Log4j2
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/index.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        EventHandler<MouseEvent> eventHandler = e -> log.debug("button pressed");

        Button button = (Button) scene.lookup("#button");
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
}
