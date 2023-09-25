package com.dfrb.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dfrb@ne
 */

public class ArrayListToStringArray {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        
        listOfStrings.add("String One");
        listOfStrings.add("String Two");
        listOfStrings.add("String Three");
        listOfStrings.add("String Four");
        listOfStrings.add("String Five");
        
        // 1ra. Forma: Creando un Array de String con el tamaño de la Lista
        String[] stringArray = new String[listOfStrings.size()];
        
        for (int i = 0; i < listOfStrings.size(); i++) {
            stringArray[i] = listOfStrings.get(i);
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("String value at index " + i + " is " + stringArray[i]);
        }

        // 2da. Forma: Utilizando el metodo toArray() sobre la Lista
        System.out.println("2da. Forma: Utilizando List.toArray()");
        String[] stringArray2 = listOfStrings.toArray(new String[listOfStrings.size()]);

        for (int i = 0; i < stringArray2.length; i++) {
            System.out.println("String value at index " + i + " is " + stringArray2[i]);
        }

        // 3ra. Forma: Using Stream api toArray() method and passing the String array object with method reference
        System.out.println("3da. Forma: Usando Stream.toArray() Method");
        String[] stringArray3 = listOfStrings.stream().toArray(String[]::new);

        for (int i = 0; i < stringArray3.length; i++) {
            System.out.println("String value at index " + i + " is " + stringArray3[i]);
        }

        // 4ta Forma: Usando los metodos Arrays.toArray() y Arrays.copyof()
        System.out.println("4ta. Forma: Usando los metodos Arrays.toArray() y Arrays.copyof()");
        Object[] objectList = listOfStrings.toArray();
        String[] stringArray4 = Arrays.copyOf(objectList, objectList.length, String[].class);

        for (int i = 0; i < stringArray4.length; i++) {
            System.out.println("String value at index " + i + " is " + stringArray4[i]);
        }
    }
}
