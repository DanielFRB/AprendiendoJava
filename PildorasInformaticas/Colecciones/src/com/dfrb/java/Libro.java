package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Libro {
    public Libro(String t, String a, int isbn) {
        this.titulo = t;
        this.autor = a;
        this.ISBN = isbn;
    }
    
    /*
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otroLibro = (Libro) obj;
            if (this.ISBN == otro.ISBN) {
                return true;
            } else {
                retuen false;
            }
        } else {
            return false;
        }
    }
    */
    
    // Metodos Generados por el IDE
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Libro l = (Libro) o;
        return this.ISBN == l.ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.ISBN;
        return hash;
    }
    
    public String getDatosLibro() {
        return "El Titulo es: "+ titulo +". El Autor es: "+ autor +" y el ISBN es: "+ ISBN;
    }
    
    private String titulo;
    private String autor;
    private int ISBN;
}
