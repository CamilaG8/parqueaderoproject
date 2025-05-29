package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.ClienteRepo;

import java.util.List;

public class ClienteRepoImpl  implements ClienteRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public Cliente findCliente(String nombre) {
        return null;
    }

    @Override
    public void saveCliente(Cliente cliente) {

    }

    @Override
    public void deleteCliente(String cedula) {

    }

    @Override
    public List<Cliente> findAllClientes() {
        return List.of();
    }

    @Override
    public List<Cliente> findClienteByNombre(String nombre) {
        return List.of();
    }

    @Override
    public List<Cliente> findClienteByCedula(String apellido) {
        return List.of();
    }


}
