package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class CompruebaMail_2 {
    public static void main(String[] args) {
        int arroba = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("Introduce tu mail");
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto) {
            System.out.println("El mail es correcto");
        } else {
            System.out.println("El mail no es correcto");
        }
    }
}
