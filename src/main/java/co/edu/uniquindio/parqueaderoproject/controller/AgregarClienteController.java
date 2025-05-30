package co.edu.uniquindio.parqueaderoproject.controller;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.service.Alerta;
import co.edu.uniquindio.parqueaderoproject.service.IdGenerator;
import co.edu.uniquindio.parqueaderoproject.service.implement.ClienteServiceImpl;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.ClienteService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AgregarClienteController {

    ClienteService clienteService = new ClienteServiceImpl();

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtCorreoCliente;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtTelefonoCliente;

    private ClienteController clienteController;

    @FXML
    void guardarCliente(ActionEvent event) {

        String nombre = txtNombreCliente.getText();
        String cedula = txtCedulaCliente.getText();
        String correo = txtCorreoCliente.getText();
        String telefono = txtTelefonoCliente.getText();

        Cliente cliente = new Cliente(IdGenerator.instance.generateId(), nombre, cedula, telefono, correo);
        clienteService.registrarCliente(cliente);
        Alerta.getInstance().alertaInfo("Cliente Agregado", "Cliente agregado con exito");
        clienteController.updateTableCliente();

    }

    public void setClienteController(ClienteController clienteController){

        this.clienteController = clienteController;

    }

}
