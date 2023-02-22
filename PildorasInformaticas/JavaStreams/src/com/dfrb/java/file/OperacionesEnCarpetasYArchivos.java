package com.dfrb.java.file;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class OperacionesEnCarpetasYArchivos {
    public static void main(String[] args) {
        File ruta = new File("C:"+ File.separator +"Proyectos"+ File.separator +"AprendiendoJava"+ File.separator +"PildorasInformaticas"+ File.separator +"JavaStreams"+ File.separator +"src"+ File.separator +"files"+ File.separator +"nueva_carpeta");
        ruta.mkdir();
        File nuevoArchivo = new File("C:"+ File.separator +"Proyectos"+ File.separator +"AprendiendoJava"+ File.separator +"PildorasInformaticas"+ File.separator +"JavaStreams"+ File.separator +"src"+ File.separator +"files"+ File.separator +"nueva_carpeta"+ File.separator +"archivo.txt");
        try {
            nuevoArchivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String rutaArchivo = nuevoArchivo.getAbsolutePath();
        EscribeEnArchivo archivo = new EscribeEnArchivo();
        archivo.escribe(rutaArchivo);
        // archivo.eliminar(rutaArchivo);
    }
}

class EscribeEnArchivo {
    public void escribe(String rutaArchivo) {
        String frase = "Esta es una prueba de escritura dentro de un nuevo archivo.";
        try {
            FileWriter escribe = new FileWriter(rutaArchivo);
            for (int i = 0; i < frase.length(); i++) {
                escribe.write(frase.charAt(i));
            }
            System.out.println("Archivo escrito con exito");
            escribe.close();
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }
    
    public void eliminar(String rutaArchivo) {
        File archivoEliminar = new File(rutaArchivo);
        archivoEliminar.delete();
        System.out.println("Archivo eliminado.");
    }
}
