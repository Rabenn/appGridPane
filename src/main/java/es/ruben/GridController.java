package es.ruben;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GridController {

    @FXML
    private Button botonCancel;

    @FXML
    private Button botonOK;

    @FXML
    private Label labelDescription;

    @FXML
    private Label labelNombre;

    @FXML
    private Label labelStatus;

    @FXML
    private TextArea textareaDescripcion;

    @FXML
    private TextField textfieldNombre;

    @FXML
    private void onOkClicked() {
        String texto = textfieldNombre.getText().trim();
        if (!texto.isEmpty()) {
            if (!textareaDescripcion.getText().isEmpty()) {
                textareaDescripcion.appendText("\n" + texto);
            } else {
                textareaDescripcion.setText(texto);
            }
            textfieldNombre.clear();
        }
    }

    @FXML
    private void onCancelClicked() {
        textfieldNombre.clear();
        textareaDescripcion.clear();
    }
}