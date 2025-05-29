package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Pago;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.PagoRepo;

import java.util.ArrayList;
import java.util.List;

public class PagoRepoImpl implements PagoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public List<Pago> findAllPagos() {

        ArrayList<Pago> pagos = new ArrayList<>();
        pagos.addAll(parqueadero.getPagos());
        return pagos;
    }

    @Override
    public void insertPago(Pago pago) {

        ArrayList<Pago> pagos = parqueadero.getPagos();
        pagos.add(pago);
        parqueadero.setPagos(pagos);

    }
}
