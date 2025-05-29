package co.edu.uniquindio.parqueaderoproject.repositories.implement;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;
import co.edu.uniquindio.parqueaderoproject.model.classes.Parqueadero;
import co.edu.uniquindio.parqueaderoproject.repositories.interfaces.IngresoRepo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IngresoRepoImpl implements IngresoRepo {

    Parqueadero parqueadero = Parqueadero.getInstancia();

    @Override
    public List<Ingreso> findAllIngresos() {

        ArrayList<Ingreso> ingresos = new ArrayList<>();
        ingresos.addAll(parqueadero.getIngresos());

        return ingresos;
    }

    @Override
    public void insertIngreso(Ingreso ingreso) {

        ArrayList<Ingreso> ingresos = parqueadero.getIngresos();
        ingresos.add(ingreso);
        parqueadero.setIngresos(ingresos);

    }
}
