package co.edu.uniquindio.parqueaderoproject.model.classes;

import java.time.LocalDateTime;

public class Ingreso {

    private String id;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    private String placa;
    private String tipoVehiculo;

    public Ingreso(String id, LocalDateTime entrada, String placa, String tipoVehiculo) {
        this.id = id;
        this.entrada = entrada;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getId() {
        return id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setId(String id) {
        this.id = id;


    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
