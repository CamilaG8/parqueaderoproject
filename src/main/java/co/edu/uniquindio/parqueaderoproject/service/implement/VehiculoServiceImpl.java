package co.edu.uniquindio.parqueaderoproject.service.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.VehiculoService;

import java.util.List;

public class VehiculoServiceImpl implements VehiculoService {

    @Override
    public List<Vehiculo> listarVehiculos() {
        return List.of();
    }

    @Override
    public List<Vehiculo> listarVehiculosPorCedula(String cedula) {
        return List.of();
    }

    @Override
    public List<Vehiculo> listarVehiculosPorPlaca(String placa) {
        return List.of();
    }

    @Override
    public String agregarVehiculo(Vehiculo vehiculo) {
        return "";
    }

    @Override
    public String eliminarVehiculo(String placa) {
        return "";
    }

    @Override
    public String actualizarVehiculo(Vehiculo vehiculo) {
        return "";
    }

    @Override
    public String pagarMembresia(String placa) {
        return "";
    }

    @Override
    public String pagarSalida(Ingreso ingreso) {
        return "";
    }
}
