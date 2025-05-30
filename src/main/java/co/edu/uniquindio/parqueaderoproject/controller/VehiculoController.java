package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.*;
import co.edu.uniquindio.parqueaderoproject.service.IdGenerator;
import co.edu.uniquindio.parqueaderoproject.service.implement.VehiculoServiceImpl;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.ClienteService;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.VehiculoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VehiculoController implements Initializable {


    @FXML
    private TableColumn<?, ?> colColor;

    @FXML
    private TableColumn<?, ?> colModelo;

    @FXML
    private TableColumn<?, ?> colPlaca;

    @FXML
    private TableView<Vehiculo> tblVehiculo;

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
    private TextField txtBarraBusqueda;

    private String valor_filtro;
    private Vehiculo vehiculoSeleccionado;
    private ObservableList<Vehiculo> vehiculosObservables;
    private ObservableList<Vehiculo> filtroObservableVehiculo;
    private ArrayList<Vehiculo> vehiculosActualizados;
    ClienteService clienteService;
    VehiculoService vehiculoService;

    ParqueaderoController parqueaderoController;

    @FXML
    void agregarVehiculo(ActionEvent event) throws Exception{

        FXMLLoader loader = parqueaderoController.abrirVentana("agregar-vehiculo-view.fxml","Agregar Vehiculo");
        AgregarVehiculoController agregarVehiculoController = loader.getController();
        agregarVehiculoController.setController(this);
    }

    @FXML
    void eliminarVehiculo(ActionEvent event) {

        vehiculoService.eliminarVehiculo(vehiculoSeleccionado.getPlaca());
        updateTableVehiculos();

    }

    @FXML
    void filtrarPlaca(KeyEvent event) {

        valor_filtro = this.txtBarraBusqueda.getText();
        if (valor_filtro.isEmpty()) {
            this.tblVehiculo.setItems(vehiculosObservables);
        } else {
            this.filtroObservableVehiculo.clear();
            for (Vehiculo vehiculo : this.vehiculosObservables) {
                if (String.valueOf(vehiculo.getPlaca()).equalsIgnoreCase(valor_filtro)) {
                    this.filtroObservableVehiculo.add(vehiculo);
                }
            }
            this.tblVehiculo.setItems(filtroObservableVehiculo);
        }

    }

    @FXML
    void guardarCambiosVehiculo(ActionEvent event) {

        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String tipoVehiculo = txtTipoVehiculo.getText();
        String cedula = txtCedulaCliente.getText();
        String color = txtColor.getText();
        Membresia membresia = vehiculoSeleccionado.getMembresia();

        Vehiculo vehiculo = new Vehiculo(IdGenerator.instance.generateId(),placa,
                color, modelo, membresia,cedula);

        vehiculoService.actualizarVehiculo(vehiculo);
        updateTableVehiculos();

    }

    @FXML
    void seleccionarVehiculo(MouseEvent event) {

        vehiculoSeleccionado = tblVehiculo.getSelectionModel().getSelectedItem();


        String tipoVehiculo = "";

        if(vehiculoSeleccionado instanceof Moto){
            tipoVehiculo = "moto";
        } else if (vehiculoSeleccionado instanceof Automovil) {
            tipoVehiculo = "carro";
        } else if (vehiculoSeleccionado instanceof Camion) {
            tipoVehiculo = "camion";

        }


        this.txtCedulaCliente.setText(vehiculoSeleccionado.getCedula());
        this.txtColor.setText(vehiculoSeleccionado.getColor());
        this.txtModelo.setText(vehiculoSeleccionado.getModelo());
        this.txtPlaca.setText(vehiculoSeleccionado.getPlaca());
        this.txtTipoVehiculo.setText(tipoVehiculo);


        updateTableVehiculos();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderoController = new ParqueaderoController();
        vehiculoService = new VehiculoServiceImpl();
        filtroObservableVehiculo = FXCollections.observableArrayList();
        updateTableVehiculos();
    }

    void updateTableVehiculos(){

        vehiculosActualizados = (ArrayList<Vehiculo>) vehiculoService.listarVehiculos();

        vehiculosObservables = FXCollections.observableArrayList();
        this.colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        this.colColor.setCellValueFactory(new PropertyValueFactory<>("color"));
        this.colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));

        this.vehiculosObservables.addAll(vehiculosActualizados);
        this.tblVehiculo.setItems(vehiculosObservables);
    }

}
