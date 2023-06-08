package org.example.Model;

import java.util.*;

public class SistemaSaludMunicipal {
    private Stack<Kit> kits = new Stack<>();
    private ArrayList<Persona> cola = new ArrayList<>();
    private Hashtable<Integer,Registro > tabla = new Hashtable<>();
    private Integer cantidadKits;

    public SistemaSaludMunicipal(Integer cantidadKits){
        this.cantidadKits = cantidadKits;
        for (int i = 0; i < cantidadKits ; i++) {
            kits.add(new Kit());
        }
    }

    public boolean addCola(Persona p){
        boolean flag = true;
        for (int i = 0; i < cola.size(); i++) {
            if (cola.get(i).equals(p)){
                flag = false;
            }
        }
        if(flag == true){
            cola.add(p);
        }
        return flag;
    }

    public void mostrarCola(){
        for (Persona p : cola) {
            System.out.println(p.toString());
        }
    }

    public void testear(Persona p) throws RegistroSinKit{
        if (cantidadKits > 0) {
            tabla.put(kits.peek().getId(), new Registro(p.getDni(), tomarTemperatura()));
            cantidadKits--;
        }else{
            throw new RegistroSinKit();
        }
    }

    public void testearTodos() {
        for (Persona p:cola) {
            try {
                testear(p);
            }catch (RegistroSinKit e){
                System.out.println("cuenta con mas test? SI / NO");
                Scanner in = new Scanner(System.in);
                String opcion = in.nextLine();
                if(opcion.toLowerCase().equals("no") ){
                    return;
                }else if(opcion.toLowerCase().equals("si") ){
                    System.out.println("cuantos kits mas hay?");
                    cantidadKits += in.nextInt();
                }
            }
        }
    }

    public Double tomarTemperatura(){
        return (Double) (Math.random()*3 + 36);
    }

    public void controlTemp  (Registro r) throws TemperaturaAltaException{
        if(r.getTemperatura()>=38){
            throw new TemperaturaAltaException();
        }
    }

    public void aislar(Registro r){
        try{
            controlTemp(r);
        }catch (TemperaturaAltaException e){
            Persona p= buscarPersonaDNI(r.getDni());

            System.out.println("BARRIO: " + p.getBarrio());
            System.out.println("Numero de kit: " + tabla.get(r));
        }

    }



    public Persona buscarPersonaDNI (String dni){
        Persona p = null;
        for (int i = 0; i < cola.size(); i++) {
            if (cola.get(i).getDni().equals(dni)){
                p = cola.get(i);
            }
        }
        return p;
    }

    public void agregarKits(int num){
        for (int i = 0; i < num; i++) {
            kits.add(new Kit());
        }
    }


}
