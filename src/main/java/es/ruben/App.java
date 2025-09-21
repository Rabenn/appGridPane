package es.ruben;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Clase principal que carga la interfaz de usuario desde un archivo FXML.
 * La estructura y los estilos están definidos en app_info.fxml y estilos.css.
 */
public class App extends Application {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        logger.info("App lanzada");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/app_info.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        logger.info("entra al css");
        scene.getStylesheets().add(getClass().getResource("css/estilos.css").toExternalForm());
        logger.info("funciona css");

        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.setTitle("Aplicación sencilla con GridPane");
        stage.setScene(scene);
        stage.show();
    }
}
