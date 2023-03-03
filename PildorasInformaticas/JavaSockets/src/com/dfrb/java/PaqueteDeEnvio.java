package com.dfrb.java;

import java.io.*;
import java.util.*;

/**
 * @author dfrb@ne
 */

public class PaqueteDeEnvio implements Serializable {
    public PaqueteDeEnvio() {
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ArrayList<String> getListaIPs() {
        return listaIPs;
    }

    public void setListaIPs(ArrayList<String> listaIPs) {
        this.listaIPs = listaIPs;
    }
    
    private String mensaje, nick, ip;
    private ArrayList<String> listaIPs;
}
