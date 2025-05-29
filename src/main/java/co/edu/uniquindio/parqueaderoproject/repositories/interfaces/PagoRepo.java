package co.edu.uniquindio.parqueaderoproject.repositories.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Pago;

import java.util.List;

public interface PagoRepo {

    public List<Pago> findAllPagos();
    public void insertPago(Pago pago);
    
}
