package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CreandoMarcos {
    public static void main(String[] args) {
        Marco marco1 = new Marco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame {
    public Marco() {
        setSize(500, 300);
    }
}
