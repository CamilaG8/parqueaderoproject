package co.edu.uniquindio.parqueaderoproject.repositories.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;

import java.util.List;

public interface VehiculoRepo {

    public Vehiculo findVehiculo(String placa);
    public void insertVehiculo(Vehiculo vehiculo);
    public void deleteVehiculo(Vehiculo vehiculo);
    public List<Vehiculo> findAllVehiculos();

}
