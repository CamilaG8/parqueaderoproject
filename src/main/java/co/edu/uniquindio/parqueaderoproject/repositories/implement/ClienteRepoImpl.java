package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.ClienteRepo;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepoImpl  implements ClienteRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public Cliente findCliente(String nombre) {

        for(Cliente cliente : parqueadero.getClientes()){
            if(cliente.getNombre().equals(nombre)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void saveCliente(Cliente cliente) {

        ArrayList<Cliente> clientes = parqueadero.getClientes();
        clientes.add(cliente);
        parqueadero.setClientes(clientes);

    }

    @Override
    public void deleteCliente(String cedula) {

        ArrayList<Cliente> clientes = parqueadero.getClientes();
        for(Cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                clientes.remove(cliente);
                break;
            }
        }
        parqueadero.setClientes(clientes);

    }

    @Override
    public List<Cliente> findAllClientes() {

        return parqueadero.getClientes();
    }

    @Override
    public List<Cliente> findClienteByNombre(String nombre) {

        ArrayList<Cliente> clientes = parqueadero.getClientes();
        for(Cliente cliente : clientes){
            if(cliente.getNombre().equals(nombre)){
                return clientes;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> findClientesByCedula(String cedula) {

        ArrayList<Cliente> clientes = parqueadero.getClientes();
        ArrayList<Cliente> clientes2 = new ArrayList<>();
        for(Cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                clientes2.add(cliente);
            }

        }
        return clientes2;

    }

    @Override
    public Cliente findClienteByCedula(String cedula) {

        ArrayList<Cliente> clientes = parqueadero.getClientes();
        for(Cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }


}
