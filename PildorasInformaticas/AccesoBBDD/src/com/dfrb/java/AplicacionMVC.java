package com.dfrb.java;

import com.dfrb.java.vista.MarcoAplicacionMVC;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class AplicacionMVC {
    public static void main(String[] args) {
        JFrame marcoApp = new MarcoAplicacionMVC();
        marcoApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoApp.setVisible(true);
    }
}
