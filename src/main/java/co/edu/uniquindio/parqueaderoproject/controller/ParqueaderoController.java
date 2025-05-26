package co.edu.uniquindio.parqueaderoproject.controller;

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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parqueaderoproject/view/ajustes-view.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(scene);

        AjustesController controller = loader.getController();
        stage.show();

    }

    @FXML
    void abrirVentanaClientes(MouseEvent event) {

    }

    @FXML
    void abrirVentanaIngresos(MouseEvent event) {

    }

    @FXML
    void abrirVentanaReportes(MouseEvent event) {

    }

    @FXML
    void abrirVentanaVehiculos(MouseEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Inicializar Parqueadero con datos

    }
}
