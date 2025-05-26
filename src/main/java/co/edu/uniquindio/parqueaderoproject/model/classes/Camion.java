package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Camion extends Vehiculo {

    private int numEjes;

    public Camion(String id, String placa, String color, String modelo, int numEjes, Membresia membresia) {
        super(id, placa, color, modelo, membresia);
        this.numEjes = numEjes;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
