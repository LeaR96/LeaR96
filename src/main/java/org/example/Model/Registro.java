package org.example.Model;

public class Registro {
    private String dni;
    private Double temperatura;

    public Registro(String dni, Double temperatura) {
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public String getDni() {
        return dni;
    }

    public Double getTemperatura() {
        return temperatura;
    }
}
