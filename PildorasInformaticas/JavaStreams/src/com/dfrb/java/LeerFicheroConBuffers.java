package com.dfrb.java;

import java.io.*;

/**
 * @author danfe
 */

public class LeerFicheroConBuffers {
    public static void main(String[] args) {
        LeerFicheroBuffers fichero = new LeerFicheroBuffers();
        fichero.leer();
    }
}

class LeerFicheroBuffers {   
    public void leer() {
        try {
            archivo = new FileReader("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/archivoVariasLineas.txt");
            BufferedReader buffer = new BufferedReader(archivo);
            String linea = "";
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
            buffer.close();
            System.out.println("Buffer Cerrado");
        } catch (IOException e) {
            System.out.println("No se puede localizar el fichero");
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                    System.out.println("Fichero Cerrado");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private FileReader archivo;
    private int c;
}
