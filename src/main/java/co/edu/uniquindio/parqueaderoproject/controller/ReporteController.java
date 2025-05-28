package co.edu.uniquindio.parqueaderoproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReporteController {

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colMontoPago;

    @FXML
    private TableColumn<?, ?> colPlaca;

    @FXML
    private TableView<?> tblPagos;

}
