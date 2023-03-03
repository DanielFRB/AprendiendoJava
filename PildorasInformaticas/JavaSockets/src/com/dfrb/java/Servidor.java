package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class Servidor {
    public static void main(String[] args) {
        MarcoServidor servidor = new MarcoServidor();
        servidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        servidor.setVisible(true);
    }
}

