package com.dfrb.java;

import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * @author dfrb@ne
 */

public class EnvioOnline extends WindowAdapter {
    @Override
    public void windowOpened(WindowEvent we) {
        try {
            Socket toServer = new Socket("192.168.0.200", 9090);
            PaqueteDeEnvio pdeIp = new PaqueteDeEnvio();
            pdeIp.setMensaje("Online");
            ObjectOutputStream packToServer = new ObjectOutputStream(toServer.getOutputStream());
            packToServer.writeObject(pdeIp);
            toServer.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}