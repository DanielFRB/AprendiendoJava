package com.dfrb.java;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoServidor extends JFrame implements Runnable {
    public MarcoServidor() {
        setBounds(800, 200, 400, 350);
        JPanel miLamina = new JPanel();
        miLamina.setLayout(new BorderLayout());
        areaText = new JTextArea();
        miLamina.add(areaText, BorderLayout.CENTER);
        add(miLamina);
        Thread serverAlwaysListen = new Thread(this);
        serverAlwaysListen.start();
    }
    
    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(9090);
            String nick, ip, mensaje;
            ArrayList<String> listaIPs = new ArrayList<>();
            PaqueteDeEnvio pqtRecivido;
            while (true) {
                Socket fromClient = server.accept();
                ObjectInputStream streamFromClient = new ObjectInputStream(fromClient.getInputStream());
                pqtRecivido = (PaqueteDeEnvio) streamFromClient.readObject();
                nick = pqtRecivido.getNick();
                ip = pqtRecivido.getIp();
                mensaje = pqtRecivido.getMensaje();
                if (!mensaje.equals("Online")) {
                    areaText.append("From: "+ nick +" To: "+ ip +"\nMensaje: "+ mensaje +"\n");
                    Socket toClient = new Socket(ip, 9999);
                    ObjectOutputStream streamToClient = new ObjectOutputStream(toClient.getOutputStream());
                    streamToClient.writeObject(pqtRecivido);
                    streamToClient.close();
                    toClient.close();
                    fromClient.close();
                } else {
                    InetAddress ipEntrante = fromClient.getInetAddress();
                    String remoteIp = ipEntrante.getHostAddress();
                    listaIPs.add(remoteIp);
                    pqtRecivido.setListaIPs(listaIPs);
                    for (String s : listaIPs) {
                        Socket toClient = new Socket(s, 9999);
                        ObjectOutputStream streamToClient = new ObjectOutputStream(toClient.getOutputStream());
                        streamToClient.writeObject(pqtRecivido);
                        streamToClient.close();
                        toClient.close();
                        fromClient.close();
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.getMessage();
        } catch (ClassNotFoundException cnfe) {
           cnfe.getMessage();
        }
    }
    
    private JTextArea areaText;
}
