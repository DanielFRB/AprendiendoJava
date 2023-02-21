package com.dfrb.java;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class LecturaFichero {
    public static void main(String[] args) {
        LeerFichero fichero = new LeerFichero();
        fichero.leer();
    }
}

class LeerFichero {
    public void leer() {
        try {
            entrada = new FileReader("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/ejemplo.txt");
            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado para su lectura");
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private FileReader entrada;
    private int c;
}
