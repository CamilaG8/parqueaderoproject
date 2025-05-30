package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.*;
import co.edu.uniquindio.parqueaderoproject.service.Alerta;
import co.edu.uniquindio.parqueaderoproject.service.IdGenerator;
import co.edu.uniquindio.parqueaderoproject.service.implement.VehiculoServiceImpl;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.VehiculoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AgregarVehiculoController implements Initializable {


    VehiculoService vehiculoService;

    @FXML
    private ComboBox<String> cmbTipoMembresia;

    @FXML
    private ComboBox<String> cmbTipoVehiculo;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtDatoAdicional;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPlaca;

    ObservableList<String> opcionesMembresia;
    ObservableList<String> opcionesVehiculo;
    String membresiaSeleccionada;
    String vehiculoSeleccionado;
    Tarifa tarifa = Tarifa.getInstance();
    VehiculoController vehiculoController ;

    @FXML
    void guardarVehiculo(ActionEvent event) {

        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();

        if(vehiculoSeleccionado.equalsIgnoreCase("moto")){

            vehiculoService.agregarVehiculo(new Moto(IdGenerator.instance.generateId(),
                    placa, color, modelo,Integer.parseInt(txtDatoAdicional.getText()),new Membresia(membresiaSeleccionada, 120000),"10948896325"));
        }else if(vehiculoSeleccionado.equalsIgnoreCase("carro")){
            vehiculoService.agregarVehiculo(new Automovil(IdGenerator.instance.generateId(),
                    placa, color, modelo,txtDatoAdicional.getText(),new Membresia(membresiaSeleccionada, 300000),"10948896325"));
        }else{
            vehiculoService.agregarVehiculo(new Camion(IdGenerator.instance.generateId(),
                    placa, color, modelo,Integer.parseInt(txtDatoAdicional.getText()),new Membresia(membresiaSeleccionada, 1000000),"10948896325"));
        }

        Alerta.getInstance().alertaInfo("Guardar vehiculo", "Vehiculo guardado correctamente");
        vehiculoController.updateTableVehiculos();


    }

    @FXML
    void seleccionarMembresia(ActionEvent event) {

        membresiaSeleccionada =  cmbTipoMembresia.getSelectionModel().getSelectedItem();

    }

    @FXML
    void seleccionarTipoVehiculo(ActionEvent event) {

        vehiculoSeleccionado = cmbTipoVehiculo.getSelectionModel().getSelectedItem();
        this.txtDatoAdicional.setVisible(true);

        if(vehiculoSeleccionado.equalsIgnoreCase("moto")){
            this.txtDatoAdicional.setPromptText("cilindraje");
        } else if (vehiculoSeleccionado.equalsIgnoreCase("carro")) {
            this.txtDatoAdicional.setPromptText("marca");

        }else{
            this.txtDatoAdicional.setPromptText("Numero de ejes");
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vehiculoService = new VehiculoServiceImpl();

        opcionesMembresia = FXCollections.observableArrayList("mensual","trimestral","anual");
        opcionesVehiculo = FXCollections.observableArrayList("moto","carro","camion");

        cmbTipoVehiculo.setItems(opcionesVehiculo);
        cmbTipoMembresia.setItems(opcionesMembresia);
    }

    public void setController(VehiculoController controller){
        vehiculoController = controller;
    }

}
