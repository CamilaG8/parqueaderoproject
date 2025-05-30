package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.model.classes.Tarifa;
import co.edu.uniquindio.parqueaderoproject.service.Alerta;
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

    Parqueadero parqueadero = Parqueadero.getInstancia();
    Tarifa tarifa = Tarifa.getInstance();

    @FXML
    void guardarCambiosMembresia(ActionEvent event) {

        tarifa.setValorMes(Double.parseDouble(txtTarifaMensual.getText()));
        tarifa.setValorTrimestre(Double.parseDouble(txtTarifaTrimestre.getText()));
        tarifa.setValorAnual(Double.parseDouble(txtTarifaAnual.getText()));

        Alerta.getInstance().alertaInfo("Membresia", "Valores seteados con exito");

    }

    @FXML
    void guardarCambiosPuestos(ActionEvent event) {

        parqueadero.setPuestosMoto(Integer.parseInt(txtPuestoMoto.getText()));
        parqueadero.setPuestosCarro(Integer.parseInt(txtPuestoCarro.getText()));
        parqueadero.setPuestosCamion(Integer.parseInt(txtPuestoCamion.getText()));

        Alerta.getInstance().alertaInfo("Puestos", "Valores seteados con exito");

    }

    @FXML
    void guardarCambiosTarifas(ActionEvent event) {

        tarifa.setValorHoraMoto(Double.parseDouble(txtTarifaMoto.getText()));
        tarifa.setValorHoraCarro(Double.parseDouble(txtTarifaCarro.getText()));
        tarifa.setValorHoraCamion(Double.parseDouble(txtTarifaCamion.getText()));

        Alerta.getInstance().alertaInfo("tarifas horas", "Valores seteados con exito");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
