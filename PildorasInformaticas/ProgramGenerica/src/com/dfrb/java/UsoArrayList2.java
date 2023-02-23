package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class UsoArrayList2 {
    public static void main(String[] args) {
        ArrayList2 arch = new ArrayList2(4);
        arch.add("Daniel");
        arch.add("Yaneth");
        arch.add("Oswaldo");
        arch.add("Barack");
        
        String persona = (String) arch.get(1);
        System.out.println(persona);
    }
}
