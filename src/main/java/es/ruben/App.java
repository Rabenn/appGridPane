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
 * La estructura y los estilos están definidos en App.fxml y styles.css.
 */
public class App extends Application {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {


        logger.info("Lanzador lanzado");

        // Leemos con FXMLLoader y a partir de ahi construimos los objetos
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/app_info.fxml"));

        Parent root = loader.load();

        // Crea la escena desde el FXML.
        Scene scene = new Scene(root);
        logger.info("entra al css");
        scene.getStylesheets().add(getClass().getResource("css/estilos.css").toExternalForm());
        logger.info("funciona css");

        // Muestra la ventana (Stage).
        stage.setTitle("Aplicación sencilla con GridPane");
        stage.setScene(scene);
        stage.show();
    }
}