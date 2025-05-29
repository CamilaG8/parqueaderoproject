package co.edu.uniquindio.parqueaderoproject.repositories.interfaces;

import co.edu.uniquindio.parqueaderoproject.model.classes.Ingreso;

import java.util.List;

public interface IngresoRepo {

    public List<Ingreso> findAllIngresos();
    public void insertIngreso(Ingreso ingreso);

}
