package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PagoController implements Initializable {

    ParqueaderoController parqueaderoController;

    @FXML
    private ComboBox<?> cmbConceptoPago;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtPlaca;

    @FXML
    void generarFacturaPago(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderoController.abrirVentana("factura-view.fxml","Factura");
        FacturaController facturaController = loader.getController();

    }

    @FXML
    void seleccionarConceptoPago(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderoController = new ParqueaderoController();
    }

}
