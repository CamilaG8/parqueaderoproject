package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.service.Alerta;
import co.edu.uniquindio.parqueaderoproject.service.IdGenerator;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
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
    private TableView<Cliente> tblClientes;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

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
    private String valor_filtro;
    private ObservableList<Cliente> clientesObservables;
    private Cliente clienteSeleccionado;
    private ObservableList<Vehiculo> vehiculosObservables;
    private ObservableList<String> opcionesFiltro;
    private ObservableList<Cliente> filtroObservableCliente;
    ParqueaderoController parqueaderoController;
    private ArrayList<Cliente> clientesActualizados;
    private ArrayList<Vehiculo> vehiculosActualizados;
    ClienteService clienteService;




    @FXML
    void agregarCliente(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderoController.abrirVentana("agregar-cliente-view.fxml","Agregar Cliente");
        AgregarClienteController agregarClienteController = loader.getController();
        agregarClienteController.setClienteController(this);
    }

    @FXML
    void eliminarCliente(ActionEvent event) {

        clienteService.eliminarCliente(clienteSeleccionado.getCedula());
        updateTableCliente();

    }

    @FXML
    void filtrarTexto(KeyEvent event) {

        if(filtroSeleccionado!=null) {
            switch (filtroSeleccionado){

                case "cedula":
                    filtrarPorCedula();
                    break;

                case "nombre":
                    filtrarPorNombre();
                    break;

            }

        }else{
            Alerta.getInstance().alertaInfo("Filtro", "Elige un filtro primero");
        }



    }

    private void filtrarPorNombre() {

        valor_filtro = this.txtBarraBusqueda.getText();
        if (valor_filtro.isEmpty()) {
            this.tblClientes.setItems(clientesObservables);
        } else {
            this.filtroObservableCliente.clear();
            for (Cliente cliente : this.clientesObservables) {
                if (String.valueOf(cliente.getNombre()).equalsIgnoreCase(valor_filtro)) {
                    this.filtroObservableCliente.add(cliente);
                }
            }
            this.tblClientes.setItems(filtroObservableCliente);
        }
    }

    private void filtrarPorCedula() {

        valor_filtro = this.txtBarraBusqueda.getText();
        if (valor_filtro.isEmpty()) {
            this.tblClientes.setItems(clientesObservables);
        } else {
            this.filtroObservableCliente.clear();
            for (Cliente cliente : this.clientesObservables) {
                if (String.valueOf(cliente.getCedula()).equalsIgnoreCase(valor_filtro)) {
                    this.filtroObservableCliente.add(cliente);
                }
            }
            this.tblClientes.setItems(filtroObservableCliente);
        }
    }

    @FXML
    void guardarCambios(ActionEvent event) {

        Cliente cliente = new Cliente(IdGenerator.instance.generateId(),
                this.txtNombreCliente.getText(),this.txtCedulaCliente.getText(),
                this.txtTelefonoCliente.getText(),this.txtCorreoCliente.getText());

        clienteService.actualizarCliente(cliente);
        updateTableCliente();
        Alerta.getInstance().alertaInfo("Actualizado", "Cliente actualizado exitosamente");

    }

    @FXML
    void seleccionarCliente(MouseEvent event) {

        clienteSeleccionado = tblClientes.getSelectionModel().getSelectedItem();
        this.txtCedulaCliente.setText(clienteSeleccionado.getCedula());
        this.txtCorreoCliente.setText(clienteSeleccionado.getCorreo());
        this.txtNombreCliente.setText(clienteSeleccionado.getNombre());
        this.txtTelefonoCliente.setText(clienteSeleccionado.getTelefono());

        updateTableVehiculo();
    }

    @FXML
    void seleccionarFiltro(ActionEvent event) {

        filtroSeleccionado = cmbFiltroBusqueda.getSelectionModel().getSelectedItem();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderoController = new ParqueaderoController();
        clienteService = new ClienteServiceImpl();
        opcionesFiltro = FXCollections.observableArrayList("nombre","cedula");
        this.cmbFiltroBusqueda.setItems(opcionesFiltro);
        this.filtroObservableCliente = FXCollections.observableArrayList();

        updateTableCliente();
    }

    void updateTableCliente(){

        clientesActualizados = (ArrayList<Cliente>) clienteService.listarClientes();


        clientesObservables = FXCollections.observableArrayList();
        this.colNombreCliente.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colCedulaCliente.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        this.colTelefonoCliente.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.colCorreoCliente.setCellValueFactory(new PropertyValueFactory<>("correo"));

        this.clientesObservables.addAll(this.clientesActualizados);
        this.tblClientes.setItems(clientesObservables);

    }

    void updateTableVehiculo(){

        vehiculosActualizados = clienteSeleccionado.getVehiculos();
        vehiculosObservables = FXCollections.observableArrayList();
        this.colPlacaVehiculo.setCellValueFactory(new PropertyValueFactory<>("placa"));
        this.colColorVehiculo.setCellValueFactory(new PropertyValueFactory<>("color"));
        this.colMembresiaVehiculo.setCellValueFactory(new PropertyValueFactory<>("membre"));

        this.vehiculosObservables.addAll(this.vehiculosActualizados);
        this.tblVehiculos.setItems(vehiculosObservables);
    }


}
