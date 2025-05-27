package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Automovil extends Vehiculo {

    private String marca;

    public Automovil(String id, String placa, String color, String modelo, String marca, Membresia membresia, String cedulaCliente) {
        super(id, placa, color, modelo, membresia, cedulaCliente);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
