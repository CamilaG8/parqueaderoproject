package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class IngresoController implements Initializable {

    ParqueaderoController parqueaderocontroller;


    @FXML
    private ComboBox<?> cmbTipoVehiculo;

    @FXML
    private TextField txtPlacaEntrada;

    @FXML
    private TextField txtPlacaSalida;



    @FXML
    void abrirVentanaPago(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderocontroller.abrirVentana("pago-view.fxml","Pago");
        PagoController ingresocontroller = loader.getController();

    }

    @FXML
    void pagarSalida(ActionEvent event) {

    }

    @FXML
    void registrarIngreso(ActionEvent event) {

    }

    @FXML
    void seleccionarTipoVehiculo(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderocontroller = new ParqueaderoController();
    }

}
