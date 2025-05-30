package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Cliente;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.ClienteRepo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.VehiculoRepo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoRepoImpl implements VehiculoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();
    ClienteRepo clienteRepo = new ClienteRepoImpl();
    Cliente cliente;

    @Override
    public Vehiculo findVehiculo(String placa) {

        for(Vehiculo vehiculo: parqueadero.getVehiculos()){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }

        return null;
    }

    @Override
    public void insertVehiculo(Vehiculo vehiculo) {

        ArrayList<Vehiculo> vehiculos = parqueadero.getVehiculos();
        vehiculos.add(vehiculo);
        cliente = clienteRepo.findClienteByCedula(vehiculo.getCedula());
        cliente.setVehiculo(vehiculo);

        parqueadero.setVehiculos(vehiculos);


    }

    @Override
    public void deleteVehiculo(Vehiculo vehiculo) {

        ArrayList<Vehiculo> vehiculos = parqueadero.getVehiculos();
        for(Vehiculo vehiculo2: vehiculos){
            if(vehiculo2.getPlaca().equals(vehiculo.getPlaca())){
                vehiculos.remove(vehiculo2);
                break;
            }
        }
        parqueadero.setVehiculos(vehiculos);
        cliente = clienteRepo.findClienteByCedula(vehiculo.getCedula());
        for(Vehiculo vehiculo3: cliente.getVehiculos()){
            if(vehiculo3.getPlaca().equals(vehiculo.getPlaca())){
                vehiculos.remove(vehiculo3);
                break;
            }
        }

    }

    @Override
    public List<Vehiculo> findAllVehiculos() {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.addAll(parqueadero.getVehiculos());

        return vehiculos;
    }
}
