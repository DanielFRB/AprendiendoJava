package com.dfrb.java.file;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class AccesoFicheros {
    public static void main(String[] args) {
        File ruta = new File("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src");
        System.out.println(ruta.getAbsolutePath());
        String[] archivos = ruta.list();
        for (String a : archivos) {
            System.out.println(a);
            File file = new File(ruta.getAbsolutePath(), a);
            if (file.isDirectory()) {
                String[] subCarpeta = file.list();
                for (String c : subCarpeta) {
                    System.out.println(c);
                }
            }
        }
    }
}
