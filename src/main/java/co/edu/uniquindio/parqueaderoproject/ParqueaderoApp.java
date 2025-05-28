package co.edu.uniquindio.parqueaderoproject;

import co.edu.uniquindio.parqueaderoproject.controller.ParqueaderoController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ParqueaderoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ParqueaderoApp.class.getResource("view/parqueadero-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Parqueadero Ventana Principal");
        stage.setScene(scene);
        stage.show();
        ParqueaderoController parkingController = fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch();
    }
}