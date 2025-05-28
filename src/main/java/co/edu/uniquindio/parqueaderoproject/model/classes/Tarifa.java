package co.edu.uniquindio.parqueaderoproject.model.classes;

public class Tarifa {

    public static Tarifa instance;
    private double valorHoraMoto;
    private double valorHoraCarro;
    private double valorHoraCamion;
    private double valorMes;
    private double valorTrimestre;
    private double valorAnual;

    private Tarifa( ) {

        this.valorHoraMoto = 0.0;
        this.valorHoraCarro = 0.0;
        this.valorHoraCamion = 0.0;
        this.valorMes = 0.0;
        this.valorTrimestre = 0.0;
        this.valorAnual = 0.0;
    }

    public static Tarifa getInstance() {
        if ( instance == null ) {
            instance = new Tarifa( );
        }
        return instance;
    }

    public double getValorHora(Vehiculo vehiculo) {
        if(vehiculo instanceof Moto){
            return valorHoraMoto;
        } else if (vehiculo instanceof Automovil) {
            return valorHoraCarro;
        }else{
            return valorHoraCamion;
        }
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

