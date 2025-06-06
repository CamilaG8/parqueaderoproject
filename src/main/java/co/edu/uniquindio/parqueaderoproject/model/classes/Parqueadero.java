package co.edu.uniquindio.parqueaderoproject.model.classes;

import java.util.ArrayList;

public class Parqueadero {

    private static Parqueadero instancia;
    private String nombre;
    private String direccion;
    private String representante;
    private String telefono;
    private int puestosMoto;
    private int puestosCarro;
    private int puestosCamion;
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Ingreso> ingresos;
    private ArrayList<Pago> pagos;


    private Parqueadero() {

        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        ingresos = new ArrayList<>();
        pagos = new ArrayList<>();
        nombre = "Parking";
        direccion = "Parking";
        representante = "Parking";
        telefono = "Parking";
        puestosMoto = 0;
        puestosCarro = 0;
        puestosCamion = 0;

    }

    public static Parqueadero getInstancia() {
        if (instancia == null) {
            instancia = new Parqueadero();
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    public int getPuestosMoto() {
        return puestosMoto;
    }

    public void setPuestosMoto(int puestosMoto) {
        this.puestosMoto = puestosMoto;
    }

    public int getPuestosCarro() {
        return puestosCarro;
    }

    public void setPuestosCarro(int puestosCarro) {
        this.puestosCarro = puestosCarro;
    }

    public int getPuestosCamion() {
        return puestosCamion;
    }

    public void setPuestosCamion(int puestosCamion) {
        this.puestosCamion = puestosCamion;
    }
}
