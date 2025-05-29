package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.service.implement.ClienteServiceImpl;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.ClienteService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ClienteController implements Initializable {


    @FXML
    private ComboBox<String> cmbFiltroBusqueda;

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

    private String filtroSeleccionado;

    private ObservableList<Cliente> clientes;
    private ObservableList<Vehiculo> vehiculos;
    private ObservableList<String> opcionesFiltro;
    private ObservableList<Cliente> filtroObservableCliente;




    ParqueaderoController parqueaderoController;
    ClienteService clienteService;



    @FXML
    void agregarCliente(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderoController.abrirVentana("agregar-cliente-view.fxml","Agregar Cliente");
        AgregarClienteController agregarClienteController = loader.getController();
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderoController = new ParqueaderoController();
        clienteService = new ClienteServiceImpl();
        opcionesFiltro = FXCollections.observableArrayList("nombre","cedula");
        this.cmbFiltroBusqueda.setItems(opcionesFiltro);
        updateTable();
    }

    void updateTable(){



    }


}
