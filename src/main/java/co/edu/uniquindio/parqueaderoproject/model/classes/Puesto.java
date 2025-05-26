package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Puesto {

    private String id;
    private int posicion;
    private boolean ocupado;
    private Vehiculo vehiculo;

    public Puesto(String id, int posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
