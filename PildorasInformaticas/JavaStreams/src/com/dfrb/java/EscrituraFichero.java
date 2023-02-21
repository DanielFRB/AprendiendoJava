package com.dfrb.java;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class EscrituraFichero {
    public static void main(String[] args) {
        EscribirFichero fichero = new EscribirFichero();
        fichero.escribir();
    }
}

class EscribirFichero {
    public void escribir() {
        String frase = "Esta es una prueba de escritura de un nuevo archivo para el Curso Aprendiendo Java.";
        try {
            FileWriter escribe = new FileWriter("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/archivotxtescrito.txt");
            for (int i = 0; i < frase.length(); i++) {
                escribe.write(frase.charAt(i));
            }
            System.out.println("Archivo escrito con exito");
            escribe.close();
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }
}
