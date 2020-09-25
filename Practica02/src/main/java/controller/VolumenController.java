package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.mdlVolumen;

/**
 * FXML Controller class
 *
 * @author myslf
 */
public class VolumenController implements Initializable {

    @FXML
    private Button btnApp1;
    @FXML
    private Button btnArea;
    @FXML
    private TextField tflRadio;
    @FXML
    private TextField tflArea;
    @FXML
    private TextField tflVolumen;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnSalir;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void handleApp1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Conversor.fxml"));
        Scene escena = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }

    @FXML
    private void handleArea(ActionEvent event) {
        float radio = Float.parseFloat(tflRadio.getText());
        tflArea.setText(String.format("%.2f", mdlVolumen.area(radio)));
        tflVolumen.setText(String.format("%.2f", mdlVolumen.volumen(radio)));
    }

    @FXML
    private void handleLimpiar(ActionEvent event) {
        tflArea.setText("");
        tflRadio.setText("");
        tflVolumen.setText("");
    }

    @FXML
    private void handleSalir(ActionEvent event) {
        System.exit(0);
    }

}
