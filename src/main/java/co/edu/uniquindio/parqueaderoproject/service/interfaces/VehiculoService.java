package co.edu.uniquindio.parqueaderoproject.service.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;

import java.util.List;

public interface VehiculoService {

    public List<Vehiculo> listarVehiculos();
    public List<Vehiculo> listarVehiculosPorCedula(String cedula);
    public List<Vehiculo> listarVehiculosPorPlaca(String placa);
    public String agregarVehiculo(Vehiculo vehiculo);
    public String eliminarVehiculo(String placa);
    public String actualizarVehiculo(Vehiculo vehiculo);
    public String pagarMembresia(String placa);
    public String pagarSalida(Ingreso ingreso);

}
