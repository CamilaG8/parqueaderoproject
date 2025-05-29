package co.edu.uniquindio.parqueaderoproject.service.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    @Override
    public String registrarCliente(Cliente cliente) {


        return "";
    }

    @Override
    public List<Cliente> buscarClientesPorCedula(String cedula) {
        return List.of();
    }

    @Override
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        return List.of();
    }

    @Override
    public List<Cliente> listarClientes() {
        return List.of();
    }

    @Override
    public String actualizarCliente(Cliente cliente) {
        return "";
    }

    @Override
    public String eliminarCliente(String cedula) {
        return "";
    }
}
