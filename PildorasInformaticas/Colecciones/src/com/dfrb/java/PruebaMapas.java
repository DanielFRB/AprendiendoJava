package com.dfrb.java;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author dfrb@ne
 */

public class PruebaMapas {
    public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<>();
        personal.put("145", new Empleado("Daniel"));
        personal.put("146", new Empleado("Yaneth"));
        personal.put("147", new Empleado("Oswaldo"));
        personal.put("148", new Empleado("Barack"));
        System.out.println(personal);
        System.out.println("------------------------");
        
        personal.remove("145");
        System.out.println(personal);
        personal.put("148", new Empleado("Maritza"));
        System.out.println(personal);
        System.out.println("------------------------");
        
        for (Map.Entry<String, Empleado> map : personal.entrySet()) {
            System.out.println("Clave: "+ map.getKey() +", Valor: "+ map.getValue());
        }
        System.out.println("------------------------");
        
        // Usando Iteradores
        for (Iterator<Map.Entry<String, Empleado>> iterMap = personal.entrySet().iterator(); iterMap.hasNext(); ) {
            Map.Entry<String, Empleado> p = iterMap.next();
            System.out.println("Clave: "+ p.getKey() +", Valor: "+ p.getValue());
        }
        System.out.println("------------------------");
        
        // Usando Operaciones Funcionales con lambdas
        personal.entrySet().forEach(map -> {
            System.out.println("Clave: "+ map.getKey() +", Valor: "+ map.getValue());
        });
        System.out.println("------------------------");
        
        // Usando clases anonimas internas
        personal.entrySet().forEach(new Consumer<Map.Entry<String, Empleado>>() {
            @Override
            public void accept(Map.Entry<String, Empleado> map) {
                System.out.println("Clave: "+ map.getKey() +", Valor: "+ map.getValue());
            }
        });
    }
}
