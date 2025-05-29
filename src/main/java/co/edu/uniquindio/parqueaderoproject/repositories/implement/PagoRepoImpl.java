package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Pago;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.PagoRepo;

import java.util.List;

public class PagoRepoImpl implements PagoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public List<Pago> findAllPagos() {
        return List.of();
    }

    @Override
    public void insertPago(Pago pago) {

    }
}
