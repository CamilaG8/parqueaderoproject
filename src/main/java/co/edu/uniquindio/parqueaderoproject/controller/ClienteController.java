package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class ClienteController {

    @FXML
    private ComboBox<?> cmbFiltroBusqueda;

    @FXML
    private TableColumn<?, ?> colCedulaCliente;

    @FXML
    private TableColumn<?, ?> colColorVehiculo;

    @FXML
    private TableColumn<?, ?> colCorreoCliente;

    @FXML
    private TableColumn<?, ?> colMembresiaVehiculo;

    @FXML
    private TableColumn<?, ?> colNombreCliente;

    @FXML
    private TableColumn<?, ?> colPlacaVehiculo;

    @FXML
    private TableColumn<?, ?> colTelefonoCliente;

    @FXML
    private TableView<?> tblClientes;

    @FXML
    private TableView<?> tblVehiculos;

    @FXML
    private TextField txtBarraBusqueda;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtCorreoCliente;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtTelefonoCliente;

    @FXML
    void agregarCliente(ActionEvent event) {

    }

    @FXML
    void eliminarCliente(ActionEvent event) {

    }

    @FXML
    void filtrarTexto(KeyEvent event) {

    }

    @FXML
    void guardarCambios(ActionEvent event) {

    }

    @FXML
    void seleccionarCliente(MouseEvent event) {

    }

    @FXML
    void seleccionarFiltro(ActionEvent event) {

    }

}
