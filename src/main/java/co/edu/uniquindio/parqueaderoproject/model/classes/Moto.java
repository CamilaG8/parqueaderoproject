package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String id,String placa, String color, String modelo, int cilindraje, Membresia membresia) {
        super(id,placa, color, modelo, membresia);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
