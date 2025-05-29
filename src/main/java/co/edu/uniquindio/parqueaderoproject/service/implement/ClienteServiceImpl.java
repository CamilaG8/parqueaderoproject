package co.edu.uniquindio.parqueaderoproject.service.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.ClienteRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.ClienteRepo;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    ClienteRepo clienteRepo = new ClienteRepoImpl();

    @Override
    public String registrarCliente(Cliente cliente) {

        clienteRepo.saveCliente(cliente);

        return "Cliente agregado correctamente";
    }

    @Override
    public List<Cliente> buscarClientesPorCedula(String cedula) {
        return clienteRepo.findClientesByCedula(cedula);
    }

    @Override
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        return clienteRepo.findClienteByNombre(nombre);
    }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepo.findAllClientes();
    }

    @Override
    public String actualizarCliente(Cliente cliente) {

        Cliente clienteViejo = clienteRepo.findClienteByCedula(cliente.getCedula());
        clienteRepo.deleteCliente(clienteViejo.getCedula());
        clienteRepo.saveCliente(cliente);

        return "Cliente actualizado con éxito";
    }

    @Override
    public String eliminarCliente(String cedula) {

        clienteRepo.deleteCliente(cedula);

        return "Cliente eliminado correctamente";
    }
}
