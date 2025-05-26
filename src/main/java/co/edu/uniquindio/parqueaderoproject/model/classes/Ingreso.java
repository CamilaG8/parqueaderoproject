package co.edu.uniquindio.parqueaderoproject.model.classes;

import java.time.LocalDateTime;

public class Ingreso {

    private String id;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    private String placa;

    public Ingreso(String id, LocalDateTime entrada, LocalDateTime salida, String placa) {
        this.id = id;
        this.entrada = entrada;
        this.salida = salida;
        this.placa = placa;
    }

    public String getId() {
        return id;
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
