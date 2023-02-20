package com.dfrb.java;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CompruebaMailConExcepcion2 {
    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("Introduce tu mail");
        try {
            examinaEmail(mail);
        } catch (LongitudMailErronea e) {
            System.err.println("El mail es demasiado corto");
            e.printStackTrace();
        }
    }
    
    static void examinaEmail(String email) throws LongitudMailErronea {
        int arroba = 0;
        boolean punto = false;
        if (email.length() <= 3) {
            throw new LongitudMailErronea();
        } else {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    arroba++;
                }
                if (email.charAt(i) == '.') {
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
}

class LongitudMailErronea extends Exception {
    public LongitudMailErronea() {}
    
    public LongitudMailErronea(String msjError) {
        super(msjError);
    }
}
