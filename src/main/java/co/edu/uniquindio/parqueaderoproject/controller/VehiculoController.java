package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class VehiculoController {

    @FXML
    private TableColumn<?, ?> colColor;

    @FXML
    private TableColumn<?, ?> colModelo;

    @FXML
    private TableColumn<?, ?> colPlaca;

    @FXML
    private TableView<?> tblVehiculo;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtTipoVehiculo;

    @FXML
    void agregarVehiculo(ActionEvent event) {

    }

    @FXML
    void eliminarVehiculo(ActionEvent event) {

    }

    @FXML
    void filtrarPlaca(KeyEvent event) {

    }

    @FXML
    void guardarCambiosVehiculo(ActionEvent event) {

    }

    @FXML
    void seleccionarVehiculo(MouseEvent event) {

    }

}
