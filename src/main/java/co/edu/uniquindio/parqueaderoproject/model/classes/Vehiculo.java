package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Vehiculo {

        private String id;
        private String placa;
        private String color;
        private String modelo;
        private Membresia membresia;
        private String cedulaCliente;

    public Vehiculo(String id, String placa, String color, String modelo, Membresia membresia, String cedulaCliente) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.membresia = membresia;
        this.cedulaCliente = cedulaCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedulaCliente;
    }

    public void setCedula(String cedula) {
        this.cedulaCliente = cedula;
    }
}
