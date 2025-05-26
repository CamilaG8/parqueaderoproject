package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.service.DataGenerator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ParqueaderoController implements Initializable {

    @FXML
    private Label lblTitulo;

    @FXML
    void abrirAjustes(MouseEvent event) throws Exception {

        FXMLLoader loader =abrirVentana("ajustes-view.fxml","Ajustes");
        AjustesController controller = loader.getController();


    }

    @FXML
    void abrirVentanaClientes(MouseEvent event) throws Exception {

        FXMLLoader loader = abrirVentana("cliente-view.fxml","Clientes");
        ClienteController controller = loader.getController();

    }

    @FXML
    void abrirVentanaIngresos(MouseEvent event) throws Exception {

        FXMLLoader loader =abrirVentana("ingreso-view.fxml","Ingresos");
        IngresoController controller = loader.getController();

    }

    @FXML
    void abrirVentanaReportes(MouseEvent event)  throws Exception {

        FXMLLoader loader =abrirVentana("reporte-view.fxml","Reportes");
        ReporteController controller = loader.getController();

    }

    @FXML
    void abrirVentanaVehiculos(MouseEvent event) throws Exception {
        FXMLLoader loader =abrirVentana("vehiculo-view.fxml","Vehiculos");
        VehiculoController controller = loader.getController();

    }


    FXMLLoader abrirVentana(String ruta, String nombreVentana) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parqueaderoproject/view/"+ruta));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle(nombreVentana);
        stage.setScene(scene);

        stage.show();

        return loader;

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        DataGenerator dg = new DataGenerator();
        dg.generarData();
        updateData();



    }

    void updateData(){

        Parqueadero parking = Parqueadero.getInstancia();
        lblTitulo.setText(parking.getNombre());

    }
}
