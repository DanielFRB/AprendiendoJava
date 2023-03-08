package com.dfrb.java.metadatos;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class AplicacionUniversalMetadata {
    public static void main(String[] args) {
        MarcoMetadataJDBC marco = new MarcoMetadataJDBC();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
