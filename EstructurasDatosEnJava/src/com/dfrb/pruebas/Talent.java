package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

class Programmer {
    protected void code() {
        System.out.println("Hola Programadores");
    }
}

// Clase Talent hereda de la Clase Programmer
public class Talent extends Programmer {
    /* Este codigo nos da eror en tiempo de compilacion debido a que no se puede sobrescribir dicho metodo heredado
    sin cambiar su modificador de acceso
    void code() {
        System.out.println("Hola a los nuevos Programadores");
    } */
    
    @Override
    protected void code() {
        System.out.println("Hola a los nuevos Programadores");
    }
    
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.code(); // imprime "Hola Programadores"
        System.out.println("------------");
        Programmer p1 = new Talent();
        p1.code(); // imprime "Hola a los nuevos Programadores"
    }
}
