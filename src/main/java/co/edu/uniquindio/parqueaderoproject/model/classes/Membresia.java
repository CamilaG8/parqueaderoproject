package co.edu.uniquindio.parqueaderoproject.model.classes;

import java.time.LocalDateTime;

public class Membresia {

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String tipo; // mensual, trimestral, anual
    private double valorPagado;

    public Membresia(String tipo, double valorPagado) {
        this.tipo = tipo.toLowerCase();
        this.valorPagado = valorPagado;
        this.fechaInicio = LocalDateTime.now();
        this.fechaFin = calcularFechaFin(this.tipo);
    }

    private LocalDateTime calcularFechaFin(String tipo) {
        return switch (tipo) {
            case "mensual" -> fechaInicio.plusMonths(1);
            case "trimestral" -> fechaInicio.plusMonths(3);
            case "anual" -> fechaInicio.plusYears(1);
            default -> fechaInicio; // por defecto, sin vigencia real
        };
    }

    public boolean estaActiva() {
        return LocalDateTime.now().isBefore(fechaFin);
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        this.fechaFin = calcularFechaFin(tipo);
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    @Override
    public String toString() {
        return "Membresía tipo '" + tipo + "' activa hasta " + fechaFin.toLocalDate() +
                " - Valor: $" + valorPagado;
    }
}
