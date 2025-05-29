package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.IngresoRepo;

import java.util.List;

public class IngresoRepoImpl implements IngresoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public List<Ingreso> findAllIngresos() {
        return List.of();
    }

    @Override
    public void insertIngreso(Ingreso ingreso) {

    }
}
