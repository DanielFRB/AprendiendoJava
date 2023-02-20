package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CompruebaMailConExcepcion {
    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("Introduce tu mail");
        examinaEmail(mail);
    }
    
    static void examinaEmail(String email) throws ArrayIndexOutOfBoundsException {
        int arroba = 0;
        boolean punto = false;
        // Con el condicional if se evalua la cantidad de letras introducido por parte del usuario
        if (email.length() <= 3) { // Aqui estanos obligando a nuestro programa a lanzar una excepcion
            throw new ArrayIndexOutOfBoundsException();
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
