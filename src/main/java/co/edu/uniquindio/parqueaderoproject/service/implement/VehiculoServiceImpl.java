package co.edu.uniquindio.parqueaderoproject.service.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.model.classes.Pago;
import co.edu.uniquindio.parqueaderoproject.model.classes.Vehiculo;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.IngresoRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.PagoRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.implement.VehiculoRepoImpl;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.IngresoRepo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.PagoRepo;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.VehiculoRepo;
import co.edu.uniquindio.parqueaderoproject.service.interfaces.VehiculoService;

import java.util.ArrayList;
import java.util.List;

public class VehiculoServiceImpl implements VehiculoService {

    VehiculoRepo vehiculoRepo = new VehiculoRepoImpl();
    PagoRepo pagoRepo = new PagoRepoImpl();
    IngresoRepo ingresoRepo = new IngresoRepoImpl();

    @Override
    public List<Vehiculo> listarVehiculos() {

        return vehiculoRepo.findAllVehiculos();
    }

    @Override
    public List<Vehiculo> listarVehiculosPorCedula(String cedula) {

        ArrayList<Vehiculo> listaVehiculos =(ArrayList<Vehiculo>) vehiculoRepo.findAllVehiculos();
        ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<>();

        for(Vehiculo vehiculo: listaVehiculos){
            if(vehiculo.getCedula().equals(cedula)){
                vehiculosFiltrados.add(vehiculo);
            }
        }

        return vehiculosFiltrados;
    }

    @Override
    public List<Vehiculo> listarVehiculosPorPlaca(String placa) {

        ArrayList<Vehiculo> vehiculos = (ArrayList<Vehiculo>) vehiculoRepo.findAllVehiculos();
        ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<>();

        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.getPlaca().equals(placa)){
                vehiculosFiltrados.add(vehiculo);
            }
        }

        return vehiculosFiltrados;
    }

    @Override
    public String agregarVehiculo(Vehiculo vehiculo) {

        vehiculoRepo.insertVehiculo(vehiculo);

        return "Vehiculo agregado con éxito";
    }

    @Override
    public String eliminarVehiculo(String placa) {

        Vehiculo vehiculo = vehiculoRepo.findVehiculo(placa);
        vehiculoRepo.deleteVehiculo(vehiculo);

        return "Vehiculo eliminado con éxito";
    }

    @Override
    public String actualizarVehiculo(Vehiculo vehiculo) {

        vehiculoRepo.deleteVehiculo(vehiculoRepo.findVehiculo(vehiculo.getPlaca()));
        vehiculoRepo.insertVehiculo(vehiculo);

        return "Vehiculo actualizado con éxito";
    }

    @Override
    public String pagarMembresia(Pago pago) {

        pagoRepo.insertPago(pago);
        return "Membresía pagado con éxito";
    }

    @Override
    public String pagarSalida(Ingreso ingreso) {
        //Pendiente
        return "";
    }

    @Override
    public String agregarIngreso(Ingreso ingreso) {
        ingresoRepo.insertIngreso(ingreso);
        return "Ingreso agregado con éxito";
    }
}
