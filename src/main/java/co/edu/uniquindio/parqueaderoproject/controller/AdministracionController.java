package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdministracionController implements Initializable {

    @FXML
    private TextField txtPuestoCamion;

    @FXML
    private TextField txtPuestoCarro;

    @FXML
    private TextField txtPuestoMoto;

    @FXML
    private TextField txtTarifaAnual;

    @FXML
    private TextField txtTarifaCamion;

    @FXML
    private TextField txtTarifaCarro;

    @FXML
    private TextField txtTarifaMensual;

    @FXML
    private TextField txtTarifaMoto;

    @FXML
    private TextField txtTarifaTrimestre;

    @FXML
    void guardarCambiosMembresia(ActionEvent event) {

    }

    @FXML
    void guardarCambiosPuestos(ActionEvent event) {

    }

    @FXML
    void guardarCambiosTarifas(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
