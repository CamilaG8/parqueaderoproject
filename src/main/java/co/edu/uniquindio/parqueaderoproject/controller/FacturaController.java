package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.model.classes.Tarifa;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FacturaController implements Initializable {

    @FXML
    private Label labelNombreParking;

    @FXML
    private Label labelNombreParking1;

    @FXML
    private Label labelNombreParking11;

    @FXML
    private Label labelNombreParking111;

    @FXML
    private Label labelNombreParking1111;

    @FXML
    private Label labelNombreParking11111;

    @FXML
    private Label lblColor;

    @FXML
    private Label lblDireccionParking;

    @FXML
    private Label lblFechaFin;

    @FXML
    private Label lblFechaIngreso;

    @FXML
    private Label lblPlaca;

    @FXML
    private Label lblRepresentanteParking;

    @FXML
    private Label lblTelefonoParking;

    @FXML
    private Label lblTotalPagar;

    IngresoController ingresoController;

    Parqueadero parqueadero = Parqueadero.getInstancia();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.lblDireccionParking.setText(parqueadero.getDireccion());
        this.lblTelefonoParking.setText(parqueadero.getTelefono());
        this.lblRepresentanteParking.setText(parqueadero.getRepresentante());
    }

    public void setController(IngresoController ingresoController) {
        this.ingresoController = ingresoController;

    }
}
