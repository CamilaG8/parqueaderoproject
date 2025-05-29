package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.VehiculoRepo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoRepoImpl implements VehiculoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

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
        parqueadero.setVehiculos(vehiculos);

    }

    @Override
    public void deleteVehiculo(Vehiculo vehiculo) {

        ArrayList<Vehiculo> vehiculos = parqueadero.getVehiculos();
        vehiculos.remove(vehiculo);
        parqueadero.setVehiculos(vehiculos);

    }

    @Override
    public List<Vehiculo> findAllVehiculos() {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.addAll(parqueadero.getVehiculos());

        return vehiculos;
    }
}
