package com.dfrb.clasespropias;

/**
 * @author dfrb@ne
 */

public class UsoPareja {
    public static void main(String[] args) {
        Pareja<String> una = new Pareja<>();
        una.setPrimero("Daniel");
        System.out.println(una.getPrimero());
        Persona pers01 = new Persona("Yaneth");
        Pareja<Persona> dos = new Pareja<>();
        dos.setPrimero(pers01);
        System.out.println(dos.getPrimero());
    }
}

class Persona {
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    private String nombre;
}
