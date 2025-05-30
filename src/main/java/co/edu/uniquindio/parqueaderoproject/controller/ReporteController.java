package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Pago;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.PagoRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.PagoRepo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ReporteController implements Initializable {

    PagoRepo pagoRepo = new PagoRepoImpl();
    ArrayList<Pago> pagosActualizados = new ArrayList<>();
    ObservableList<Pago> pagosObservables;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        pagosActualizados = (ArrayList<Pago>) pagoRepo.findAllPagos();

        pagosObservables = FXCollections.observableArrayList();
        this.colCedula.setCellValueFactory(new PropertyValueFactory<>("cedulaCliente"));
        this.colPlaca.setCellValueFactory(new PropertyValueFactory<>("placaVehiculo"));
        this.colMontoPago.setCellValueFactory(new PropertyValueFactory<>("monto"));

        this.pagosObservables.addAll(pagosActualizados);
        this.tblPagos.setItems(pagosObservables);
    }

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colMontoPago;

    @FXML
    private TableColumn<?, ?> colPlaca;

    @FXML
    private TableView<Pago> tblPagos;

}
