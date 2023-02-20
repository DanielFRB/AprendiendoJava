package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class EntradaDatos {
    public static void main(String[] args) {
        System.out.println("Que desas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");
        
        Scanner entrada = new Scanner(System.in);
        int decision = entrada.nextInt();
        if (decision == 1) {
            pedirDatos();
        } else {
            System.out.println("Adios");
            System.exit(0);
        }
        entrada.close();
    }
    
    static void pedirDatos() throws InputMismatchException {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce tu nombre, por favor");
            String nombreUsuario = entrada.nextLine();
            System.out.println("Introduce tu edad, por favor");
            int edad = entrada.nextInt();
            System.out.println("Hola "+ nombreUsuario +". El año que viene tendras "+ (edad + 1) +" años.");
            entrada.close();
        } catch (InputMismatchException e) {
            System.out.println("Ha ocurrido un error al introducir los datos solicitados");
        }
        System.out.println("Hemos terminado");
    }
}
