package co.edu.uniquindio.parqueaderoproject.service.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;

import java.util.List;

public interface ClienteService {

    public String registrarCliente(Cliente cliente);
    public List<Cliente> buscarClientesPorCedula(String cedula);
    public List<Cliente> buscarClientesPorNombre(String nombre);
    public List<Cliente> listarClientes();
    public String actualizarCliente(Cliente cliente);
    public String eliminarCliente(String cedula);

}
