package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class VehiculoController implements Initializable {


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

    ParqueaderoController parqueaderoController;

    @FXML
    void agregarVehiculo(ActionEvent event) throws Exception{

        FXMLLoader loader = parqueaderoController.abrirVentana("agregar-vehiculo-view.fxml","Agregar Vehiculo");
        AgregarVehiculoController agregarVehiculoController = loader.getController();
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderoController = new ParqueaderoController();
    }

}
