package co.edu.uniquindio.parqueaderoproject.service;

import javafx.scene.control.Alert;

public class Alerta {

    public static Alerta instance;

    private Alerta() {

    }

    public static Alerta getInstance() {
        if (instance == null) {
            instance = new Alerta();
        }
        return instance;
    }

    public void alertaInfo (String titulo, String descripcion){

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setContentText(descripcion);
        alerta.showAndWait();
    }
}
