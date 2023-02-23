package com.dfrb.clasespropias;

/**
 * @author danfe
 */

public class HerenciaGenericos {
    public static void main(String[] args) {
        /*Empleado Administrativa = new Empleado("Elena", 25, 1500);
        Jefe DirectoraComercial = new Jefe("Yaneth", 45, 5000);
        Empleado nuevoEmpleado = DirectoraComercial;*/
        
        Pareja2<Empleado> Administrativa = new Pareja2<>();
        Pareja2<Jefe> DirectoraComercial = new Pareja2<>();
        Administrativa.setPrimero2(new Empleado("Elena", 25, 1500));
        DirectoraComercial.setPrimero2(new Jefe("Yaneth", 45, 3500));
        
        // Produce un error de compilacion ya que para las clases genericas Jefe NO hereda de Empleado
        // Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
        
        Pareja2.imprimirTrabajador(Administrativa);
        Pareja2.imprimirTrabajador(DirectoraComercial);
    }
}
