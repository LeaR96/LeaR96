package org.example.Model;

import java.util.Objects;

public class Persona  {
    private String nombreYapellido;
    private Integer edad;
    private String barrio;
    private String dni;
    private String ocupacion;

    public Persona(String nombreYapellido, Integer edad, String barrio, String dni, String ocupacion) {
        this.nombreYapellido = nombreYapellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupacion = ocupacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return dni.equals(persona.dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreYapellido='" + nombreYapellido + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", dni='" + dni + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
