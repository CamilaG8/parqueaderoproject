package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Tarifa {
    private String tipoVehiculo;
    private double valorHora;
    private double valorMes;
    private double valorTrimestre;
    private double valorAnual;

    public Tarifa(String tipoVehiculo, double valorHora, double valorMes, double valorTrimestre, double valorAnual) {
        this.tipoVehiculo = tipoVehiculo;
        this.valorHora = valorHora;
        this.valorMes = valorMes;
        this.valorTrimestre = valorTrimestre;
        this.valorAnual = valorAnual;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes(double valorMes) {
        this.valorMes = valorMes;
    }

    public double getValorTrimestre() {
        return valorTrimestre;
    }

    public void setValorTrimestre(double valorTrimestre) {
        this.valorTrimestre = valorTrimestre;
    }

    public double getValorAnual() {
        return valorAnual;
    }

    public void setValorAnual(double valorAnual) {
        this.valorAnual = valorAnual;
    }

    @Override
    public String toString() {
        return "Tarifa para " + tipoVehiculo + ": " +
                "Hora: $" + valorHora + ", Mes: $" + valorMes +
                ", Trimestre: $" + valorTrimestre + ", Año: $" + valorAnual;
    }
}

