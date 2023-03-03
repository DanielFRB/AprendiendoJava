package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoCliente extends JFrame {
    public MarcoCliente() {
        setBounds(300, 200, 240, 350);
        LaminaMarcoCliente lmc = new LaminaMarcoCliente();
        add(lmc);
        addWindowListener(new EnvioOnline());
    }
}
