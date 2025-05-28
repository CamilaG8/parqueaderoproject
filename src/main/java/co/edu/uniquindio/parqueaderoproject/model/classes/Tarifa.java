package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Tarifa {
    private double valorHoraMoto;
    private double valorHoraCarro;
    private double valorHoraCamion;
    private double valorMes;
    private double valorTrimestre;
    private double valorAnual;

    public Tarifa( double valorHoraMoto, double valorHoraCarro, double valorHoraCamion, double valorMes, double valorTrimestre, double valorAnual) {

        this.valorHoraMoto = valorHoraMoto;
        this.valorHoraCarro = valorHoraCarro;
        this.valorHoraCamion = valorHoraCamion;
        this.valorMes = valorMes;
        this.valorTrimestre = valorTrimestre;
        this.valorAnual = valorAnual;
    }

    public double getValorHoraMoto() {
        return valorHoraMoto;
    }

    public void setValorHoraMoto(double valorHoraMoto) {
        this.valorHoraMoto = valorHoraMoto;
    }

    public double getValorHoraCarro() {
        return valorHoraCarro;
    }

    public void setValorHoraCarro(double valorHoraCarro) {
        this.valorHoraCarro = valorHoraCarro;
    }

    public double getValorHoraCamion() {
        return valorHoraCamion;
    }

    public void setValorHoraCamion(double valorHoraCamion) {
        this.valorHoraCamion = valorHoraCamion;
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



}

