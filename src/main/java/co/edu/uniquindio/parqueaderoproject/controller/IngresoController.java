package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.IngresoRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.IngresoRepo;
import co.edu.uniquindio.parqueaderoproject.service.Alerta;
import co.edu.uniquindio.parqueaderoproject.service.IdGenerator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class IngresoController implements Initializable {

    ParqueaderoController parqueaderocontroller;
    ObservableList<String> opcionesVehiculo;
    String vehiculoSeleccionado;
    IngresoRepo ingresorepo = new IngresoRepoImpl();


    @FXML
    private ComboBox<String> cmbTipoVehiculo;

    @FXML
    private TextField txtPlacaEntrada;

    @FXML
    private TextField txtPlacaSalida;



    @FXML
    void abrirVentanaPago(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderocontroller.abrirVentana("pago-view.fxml","pago");
        PagoController pagoController = loader.getController();



    }

    @FXML
    void pagarSalida(ActionEvent event) throws Exception {

        FXMLLoader loader = parqueaderocontroller.abrirVentana("factura-view.fxml","factura");
        FacturaController facturaController = loader.getController();

        facturaController.setController(this);
    }

    @FXML
    void registrarIngreso(ActionEvent event) {
        ingresorepo.insertIngreso(new Ingreso(IdGenerator.instance.generateId(),
                LocalDateTime.now(),this.txtPlacaEntrada.getText(),vehiculoSeleccionado));
        Alerta.getInstance().alertaInfo("Ingreso", "Ingreso realizado con exito");
    }

    @FXML
    void seleccionarTipoVehiculo(ActionEvent event) {

        vehiculoSeleccionado = cmbTipoVehiculo.getSelectionModel().getSelectedItem();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        parqueaderocontroller = new ParqueaderoController();
        opcionesVehiculo = FXCollections.observableArrayList("Moto", "Carro", "Camion");
        cmbTipoVehiculo.setItems(opcionesVehiculo);
    }

}
