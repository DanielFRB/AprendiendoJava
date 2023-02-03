package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class CompruebaMail {
    public static void main(String[] args) {
        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Introduce tu mail");
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
        }
        if (arroba) {
            System.out.println("El mail es correcto");
        } else {
            System.out.println("El mail no es correcto");
        }
    }
}
