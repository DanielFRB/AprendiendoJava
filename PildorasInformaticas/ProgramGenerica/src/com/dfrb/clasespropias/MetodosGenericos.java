package com.dfrb.clasespropias;

/**
 * @author dfrb@ne
 */

public class MetodosGenericos {
    public static void main(String[] args) {
        String[] nombres = {"Jose", "Maria", "Pedro"};
        System.out.println(MisMatrices.getElementos(nombres));
        Empleado[] listaEmpleados = {new Empleado("Ana", 45, 2850), new Empleado("Jose", 48, 2750),
                                                                    new Empleado("Carla", 25, 1750), new Empleado("Maria", 29, 3000),
                                                                    new Empleado("Maritza", 37, 3200)};
        System.out.println(MisMatrices.getElementos(listaEmpleados));
    }
}

class MisMatrices {
    public static <T> String getElementos(T[] a) {
        return "El array tiene "+ a.length +" elementos";
    }
}
