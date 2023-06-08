package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Model.Persona;
import org.example.Model.SistemaSaludMunicipal;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SistemaSaludMunicipal sistema = new SistemaSaludMunicipal(5);

        sistema.addCola(new Persona("Pepe grillo", 15, "Los Troncos","12345678", "consejero"));
        sistema.addCola(new Persona("Homero", 40, "capital","12345678", "plomero"));
        sistema.addCola(new Persona("Bart", 10, "avellaneda","12345679", "gasista"));
        sistema.addCola(new Persona("kiko", 15, "chacarita","12345680", "mecanico"));
        sistema.addCola(new Persona("hugo", 15, "lanus","12345681", "psicologo"));
        sistema.addCola(new Persona("francisco", 15, "belgrano","12345682", "programador"));
        sistema.addCola(new Persona("Lucas", 15, "Las lilas","12345683", "diseño"));



    }
}