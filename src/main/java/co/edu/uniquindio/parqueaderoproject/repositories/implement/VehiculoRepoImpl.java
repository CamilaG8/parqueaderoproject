package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.VehiculoRepo;

import java.util.List;

public class VehiculoRepoImpl implements VehiculoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public Vehiculo findVehiculo(String placa) {
        return null;
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        return List.of();
    }

    @Override
    public void insertVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public void updateVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public void deleteVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public List<Vehiculo> findAllVehiculos() {
        return List.of();
    }
}
