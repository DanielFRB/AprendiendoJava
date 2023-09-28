package com.dfrb.ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dfrb@ne
 */

public class ArrayListReverseOrder {
    public static void main(String[] args) {
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
    }
}
