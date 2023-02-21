package com.dfrb.java;

import java.io.*;

/**
 * @author danfe
 */

public class EscribirFicheroConBuffers {
    public static void main(String[] args) {
        EscribirFicheroBuffers fichero = new EscribirFicheroBuffers();
        fichero.escribir();
    }
}

class EscribirFicheroBuffers {
    private FileWriter escribe;
    
    public void escribir() {
        String fraseEscribir = "Esta es una prueba de escritura usando buffers de memoria de un nuevo archivo de texto para el Curso Aprendiendo Java desde Cero.";
        try {
            escribe = new FileWriter("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/archivoEscritoConBuffers.txt");
            BufferedWriter buffer = new BufferedWriter(escribe);
            buffer.write(fraseEscribir);
            System.out.println("Fichero escrito con exito");
            buffer.close();
            System.out.println("Buffer Cerrado");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el fichero");
        } finally {
            try {
                if (escribe != null) {
                    escribe.close();
                    System.out.println("Fichero Cerrado");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
