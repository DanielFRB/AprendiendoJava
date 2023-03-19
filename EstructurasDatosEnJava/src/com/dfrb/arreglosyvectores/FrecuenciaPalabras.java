package com.dfrb.arreglosyvectores;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        // Usamos la Clase Vector y establecemos una Capacidad Inicial
        Vector listaPalabras = new Vector(10);
        Scanner ent = new Scanner(System.in);
        int palabras = 10;
        int i;
        System.out.println("Ingrese "+ palabras +" palabras: ");
        while (palabras > 0) {
            Asociacion informacionPalabra;
            String palabraEnLista;
            String palabra = ent.nextLine();
            for (i = 0; i < listaPalabras.size(); i++) {
                informacionPalabra = (Asociacion) listaPalabras.get(i);
                palabraEnLista = (String) informacionPalabra.getKey();
                if (palabraEnLista.equals(palabra)) {
                    Integer frecuencia = (Integer) informacionPalabra.getValue();
                    informacionPalabra.setValue(frecuencia + 1);
                    break;
                }
            }
            if (i == listaPalabras.size()) {
                // Aunque el valor inicial de la variable Vector esta establecida a 10 elementos, bien podemos seguir agregando elementos
                // sin tener que modificar el tamaño inicial del Vector.
                listaPalabras.add(new Asociacion(palabra, 1));
            }
            palabras--;
        }
        for (i = 0; i < listaPalabras.size(); i++) {
            Asociacion informacionPalabra = (Asociacion) listaPalabras.get(i);
            System.out.println(informacionPalabra.getKey() +" aparece "+ informacionPalabra.getValue() +" veces");
        }
    }
}

// Creamos una Clase que implemente la Interface Map.Entry
class Asociacion implements Map.Entry {
    public Asociacion(Object clave, Object valor) {
        this.clave = clave;
        this.valor = valor;
    }
    
    public Asociacion(Object clave) {
        this(clave, null);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null) {
            return false;
        }
        if (getClass() != otro.getClass()) {
            return false;
        }
        final Asociacion other = (Asociacion) otro;
        return Objects.equals(this.clave, other.clave);
    }
    
    @Override
    public Object getKey() {
        return this.clave;
    }

    @Override
    public Object getValue() {
        return this.valor;
    }

    @Override
    public Object setValue(Object value) {
        Object valorViejo = this.valor;
        this.valor = value;
        return valorViejo;
    }
    
    private Object clave, valor;
}
