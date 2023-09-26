package com.dfrb.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author dfrb@ne
 */

public class ConvertArrayToList {
    public static void main(String[] args) {
        // 1ra Forma: Convert Array to List using Native Generic Approach
        String[] intArray = {"10", "20", "30", "40", "50"};
        System.out.println("Array: " + Arrays.toString(intArray));
        List<String> lista = convertArrayToList(intArray);
        System.out.println("Converted ArrayList: " + lista);
        
        // 2da. Forma: Convert Array to List Using Arrays.asList()
        String[] intArray2 = {"java", "program", "to.com", "is a ", "java portal"};
        System.out.println("Array: " + Arrays.toString(intArray2));
        List<String> lista2 = convertArrayToList2(intArray2);
        System.out.println("Converted ArrayList: " + lista2);
        
        // 3ra. Forma: Convert Array to List Using Collections.addAll()
        String[] intArray3 = {"Daniel", "Felipe", "Ana", "Yaneth", "Oswaldo", "Manuel"};
        System.out.println("Array: " + Arrays.toString(intArray3));
        List<String> lista3 = convertArrayToList3(intArray3);
        System.out.println("Converted ArrayList: " + lista3);
        
        // 4ta. Forma: Convert Array to List using Arrays.stream().collect()
        String[] intArray4 = {"Daniel", "Java", "Python", "Yaneth", "Oswaldo", "Javascript"};
        System.out.println("Array: " + Arrays.toString(intArray4));
        List<String> lista4 = convertArrayToList4(intArray4);
        System.out.println("Converted ArrayList: " + lista4);
        
        // 5ta. Forma: Convert Primitive Array to List using boxed() method
        int[] intArray5 = {1, 2, 3, 4, 5, 6, 6};
        System.out.println("Array: " + Arrays.toString(intArray5));
        List<Integer> lista5 = convertPrimitiveArrayToList(intArray5);
        System.out.println("Converted ArrayList: " + lista5);
    }
    
    // 1ra. Forma: Convert Array to List using Native Generic Approach
    private static <T> List<T> convertArrayToList(T[] array) {
        List<T> outputList = new ArrayList<T>();
        for (T t : array) {
          outputList.add(t);
        }
        return outputList;
    }
    
    // 2da. Forma: Convert Array to List Using Arrays.asList()
    private static <T> List<T> convertArrayToList2(T[] array) {
        List<T> outputList = new ArrayList<T>();
        outputList = Arrays.asList(array);
        return outputList;
    }
    
    // 3ra. Forma: Convert Array to List using Native Generic Approach
    private static <T> List<T> convertArrayToList3(T[] array) {
        List<T> outputList = new ArrayList<T>();
        Collections.addAll(outputList, array);
        return outputList;
    }
    
    // 4ta. Forma: Convert Array to List using Arrays.stream().collect()
    private static <T> List<T> convertArrayToList4(T[] array) {
        Stream<T> stream = Arrays.stream(array);
        List<T> outputList = stream.collect(Collectors.toList());
        return outputList;
    }
    
    // 5ta. Forma: Convert Primitive Array to List using boxed() method
    private static List<Integer> convertPrimitiveArrayToList(int[] array) {
        Stream<Integer> stream = Arrays.stream(array).boxed();
        List<Integer> outputList = stream.collect(Collectors.toList());
        return outputList;
    }
}
