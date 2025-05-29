package co.edu.uniquindio.parqueaderoproject.repositories.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;

import java.util.List;

public interface ClienteRepo {

    public Cliente findCliente(String nombre);
    public void saveCliente(Cliente cliente); //Se usa también para actualizar
    public void deleteCliente(String cedula);
    public List<Cliente> findAllClientes();
    public List<Cliente> findClienteByNombre(String nombre);
    public List<Cliente> findClientesByCedula(String cedula);
    public Cliente findClienteByCedula(String cedula);
}
