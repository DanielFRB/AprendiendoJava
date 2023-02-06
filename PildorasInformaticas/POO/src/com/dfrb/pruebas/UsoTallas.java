package com.dfrb.pruebas;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoTallas {
    // Declaracion simple de un tipo Enumerado
    // enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String captura = entrada.next().toUpperCase();
        Talla laTalla = Enum.valueOf(Talla.class, captura);
        System.out.println("Talla: "+ laTalla);
        System.out.println("Abreviatura: "+ laTalla.dameAbreviatura());
    }
    
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        
        // Los tipos enumerados no admiten la creacion de objetos
        private Talla(String abreviatura) { // Constructor private xq no se pueda invocar el constructor fuera de la clase
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura() {
            return abreviatura;
        }
        
        private String abreviatura;
    }
}
