package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class PruebaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<>();
        personas.add("Daniel");
        personas.add("Yaneth");
        personas.add("Oswaldo");
        personas.add("Barack");
        System.out.println(personas.size());
        ListIterator<String> it = personas.listIterator();
        it.next();
        it.add("Maritza");
        for (String p : personas) {
            System.out.println(p);
        }
    }
}
