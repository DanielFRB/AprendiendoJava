package com.dfrb.ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dfrb@ne
 */

public class ArrayListReverseOrder {
    public static void main(String[] args) {
        // 1ra Forma: Ordenar un ArrayList desendente usando Collections.reverseOrder()
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(100);
        numbersList.add(45);
        numbersList.add(22);
        numbersList.add(245);
        numbersList.add(360);
        
        System.out.println("Before sorting: "+ numbersList);
        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        Collections.sort(numbersList, reverseComparator);
        System.out.println("After sorting: "+ numbersList);
        System.out.println("------------");
        
        // 2da Forma: Ordenar un ArrayList desendente usando Collections.reverse()
        List<Integer> numbersList2 = new ArrayList<>();
        numbersList2.add(240);
        numbersList2.add(145);
        numbersList2.add(28);
        numbersList2.add(24);
        numbersList2.add(36);
        
        System.out.println("Before sorting: "+ numbersList2);
        Collections.sort(numbersList2);
        Collections.reverse(numbersList2);
        System.out.println("After sorting: "+ numbersList2);
        System.out.println("------------");
        
        // 3ra Forma: Ordenar un ArrayList desendente usando stream.sorted()
        List<Integer> numbersList3 = new ArrayList<>();
        numbersList3.add(2);
        numbersList3.add(145);
        numbersList3.add(38);
        numbersList3.add(14);
        numbersList3.add(144);
        
        System.out.println("Before sorting: "+ numbersList3);
        List<Integer> descendingList = numbersList3.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        
        System.out.println("After sorting: "+ descendingList);
    }
}
