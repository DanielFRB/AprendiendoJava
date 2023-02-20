package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class EntradaDatos2 {
    public static void main(String[] args) {
        System.out.println("Que desas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");
        
        Scanner entrada = new Scanner(System.in);
        int decision = entrada.nextInt();
        if (decision == 1) {
            // Las excepciones No Controladas no nos obliga a implementar una captura de la misma, es decir, no es necesario
            // utilizar un bloque try-catch por lo que el codigo que se presenta en este ejemplo es considerado una mala practica
            try {
                pedirDatos();
            } catch (InputMismatchException e) {
                System.out.println("Ha ocurrido un error al introducir los datos solicitados");
            }
        } else {
            System.out.println("Adios");
            System.exit(0);
        }
        entrada.close();
    }
    
    // Este metodo lanza una excepcion de tipo No Controlada, eso significa que no es necesario hacer la captura del error por medio de
    // un bloque try-catch, ya que este tipo de excepciones ocurren por un fallo por parte del programador y que corrigiendo dicha falla
    // no es necesario que se lanze la excepcion.
    static void pedirDatos() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Introduce tu edad, por favor");
        int edad = entrada.nextInt();
        System.out.println("Hola "+ nombreUsuario +". El año que viene tendras "+ (edad + 1) +" años.");
        entrada.close();
        System.out.println("Hemos terminado");
    }
}
