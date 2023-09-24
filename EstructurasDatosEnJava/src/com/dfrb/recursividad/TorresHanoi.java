package com.dfrb.recursividad;

import java.io.*;
import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class TorresHanoi {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de discos: ");
        int n = entrada.nextInt();
        Hanoi('O', 'A', 'D', n);  //1:origen  2:auxiliar 3:destino
        entrada.close();
    }

    public static void Hanoi(char origen,  char auxiliar, char destino, int n){
        if (n == 1) {
            n = 1;
            System.out.println("Mover disco "+ n +" desde Torre "+ origen +" hacia Torre "+ destino);
        } else {
            Hanoi(origen, destino, auxiliar, n - 1);
            System.out.println("Mover disco "+ n + " desde Torre "+ origen +" hacia Torre "+ destino);
            Hanoi(auxiliar, origen, destino, n - 1);
        }
    }
}
