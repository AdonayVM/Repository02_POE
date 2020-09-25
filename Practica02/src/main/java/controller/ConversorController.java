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
import model.mdlConversor;

/**
 * FXML Controller class
 *
 * @author myslf
 */
public class ConversorController implements Initializable {

    @FXML
    private Button btnConvertir;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField tflDolar;
    @FXML
    private TextField tflEuro;
    @FXML
    private TextField tflPeso;
    @FXML
    private TextField tflDolarC;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnApp2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleConvertir(ActionEvent event) {
        float dolar = Float.parseFloat(tflDolar.getText());
        tflEuro.setText(String.format("%.2f", mdlConversor.euro(dolar)));
        tflPeso.setText(String.format("%.2f", mdlConversor.peso(dolar)));
        tflDolarC.setText(String.format("%.2f", mdlConversor.dolarC(dolar)));
    }

    @FXML
    private void handleLimpiar(ActionEvent event) {
        tflDolar.setText("");
        tflEuro.setText("");
        tflPeso.setText("");
        tflDolarC.setText("");
    }

    @FXML
    private void handleSalir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void handleApp2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Volumen.fxml"));
        Scene escena = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(escena);
        stage.show();
    }

}
