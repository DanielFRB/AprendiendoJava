package com.dfrb.ordenacion;

/**
 * @author dfrb@ne
 */

public class OrdenacionShell {
    public static void main(String[] args) {
        int[] arregloInt = {32, 45, 12, 10, 4, 56, 9, 5, 99, 2};
        ordShell(arregloInt);
        for (int a : arregloInt) {
            System.out.println(a);
        }
    }
    
    public static void ordShell(int[] arreglo) {
        int interval, i, j, k, n;
        n = arreglo.length;
        interval = n / 2;
        while (interval > 0) {
            for (i = interval; i < n; i++) {
                j = i - interval;
                while (j >= 0) {
                    k = j + interval;
                    if (arreglo[j] <= arreglo[k]) {
                        j = - 1;
                    } else {
                        intercambiar(arreglo, j, j+1);
                        j -= interval;
                    }
                }
            }
            // Aqui se utiliza el intervalo que mejora el rendimiento del algoritmo en vez de dividir por 2, se utiliza 2.2
            interval = (int) (interval / 2.2);
            interval = (interval == 0) ? 1 : interval;
        }
    }
    
    public static void intercambiar(int[] arreglo, int a, int b) {
        int aux = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = aux;
    }
}
