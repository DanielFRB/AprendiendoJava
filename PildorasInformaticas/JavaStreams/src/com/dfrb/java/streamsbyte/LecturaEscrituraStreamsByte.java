package com.dfrb.java.streamsbyte;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class LecturaEscrituraStreamsByte {
    public static void main(String[] args) {
        LeerEscribirArchivos archivo = new LeerEscribirArchivos();
        archivo.leerEscribir();
    }
}

class LeerEscribirArchivos {
    public void leerEscribir() {
        File original = new File("C:/Users/danfe/Desktop/imagen.jpg");
        File destino = new File("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/imagenCopia.jpg");
        try {
            int length;
            input = new FileInputStream(original);
            output = new FileOutputStream(destino);
            byte[] buffer = new byte[1024];
            System.out.println("Leyendo Archivo Original");
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            System.out.println("Archivo Copiado con Exito");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                output.close();
                System.out.println("Cerrando los flujos de entrada y salida");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private InputStream input;
    private OutputStream output;
}
