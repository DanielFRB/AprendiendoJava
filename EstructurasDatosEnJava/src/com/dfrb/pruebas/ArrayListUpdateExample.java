package com.dfrb.pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dfrb@ne
 */

public class ArrayListUpdateExample {
  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>();
    
    lista.add(4);
    lista.add(40);
    lista.add(14);
    lista.add(80);
    lista.add(124);
    
    System.out.println("Lista values before update - " + lista);
    System.out.println("Lista size before - " + lista.size());
    
    for (int index = 0; index < lista.size(); index++) {
      if (lista.get(index) % 5 == 0) {
        lista.set(index, -1);
      }
    }

    System.out.println("Lista values after updating index with new values - "+ lista);
    System.out.println("Lista size after - "+ lista.size());
  }
}
