package co.edu.uniquindio.parqueaderoproject.model.classes;

import java.time.temporal.ChronoUnit;

public class Pago {

    private String cedulaCliente;
    private String concepto;
    private String placaVehiculo;
    private double monto;


    public double calcularMonto(Ingreso ingreso, Tarifa tarifa, Vehiculo vehiculo) {
        if (vehiculo.getMembresia() != null && vehiculo.getMembresia().estaActiva()) {
        return 0.0;
        }
        long horas = ChronoUnit.HOURS.between(ingreso.getEntrada(), ingreso.getSalida());
        if (horas == 0) {
            horas = 1;
        }
        return tarifa.getValorHora(vehiculo) * horas;
    }

    public Pago(String cedulaCliente, String concepto, String placaVehiculo, double monto) {

        this.cedulaCliente = cedulaCliente;
        this.concepto = concepto;
        this.placaVehiculo = placaVehiculo;
        this.monto = monto;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}