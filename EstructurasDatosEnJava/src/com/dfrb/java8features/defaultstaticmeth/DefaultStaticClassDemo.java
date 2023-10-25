package com.dfrb.java8features.defaultstaticmeth;

/**
 * @author dfrb@ne
 */

public class DefaultStaticClassDemo implements DefaultStaticInterfaceDemo {
    public static void main(String[] args) {
        // El metodo static display() se llama directamente con el nombre de la interface
        DefaultStaticInterfaceDemo.display();
        
        // Se crea un objeto de tipo DefaultStaticClassDemo 
        DefaultStaticClassDemo defaultStaticClassDemo = new DefaultStaticClassDemo();
        
        // Se ejecuta el metodo default show() por medio del objeto creado
        defaultStaticClassDemo.show();
    }
}
