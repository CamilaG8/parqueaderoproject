package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AjustesController {

    @FXML
    private TextField direccionParkingTxt;

    @FXML
    private TextField nombreParkingTxt;

    @FXML
    private TextField representanteParkingText;

    @FXML
    private TextField telefonoParkingTxt;

    private ParqueaderoController parqueaderoController;

    @FXML
    void guardarDatosParking(MouseEvent event) {

        Parqueadero parking = Parqueadero.getInstancia();
        parking.setDireccion(direccionParkingTxt.getText());
        parking.setNombre(nombreParkingTxt.getText());
        parking.setRepresentante(representanteParkingText.getText());
        parking.setTelefono(telefonoParkingTxt.getText());
        parqueaderoController.updateData();

    }

    public void setParqueaderoController(ParqueaderoController parqueaderoController) {
        this.parqueaderoController = parqueaderoController;
    }
}
