package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

record Employee4(String name, int id) {
    public Employee4 {
        name = name.trim();
        int i = name.indexOf(',');
        int j = name.lastIndexOf(',');
    
        if(i != j) {
            throw new IllegalArgumentException("Multiple comas found.");
        }
    
        if(i < 1 | name.length() == i + 1) {
            throw new IllegalArgumentException("Required format: lastName, firstName");
        }
    }
}

public class RecordDemo4 {
    public static void main(String[] args) {
        Employee4[] eList = new Employee4[4];
    
        eList[0] = new Employee4("Doe, John", 1047);
        eList[1] = new Employee4("Jones Robert", 1048);
        eList[2] = new Employee4("Smith, Rachel", 1049);
        eList[3] = new Employee4("Martin, Dave", 1050);
    
        for(Employee4 e : eList) {
            System.out.println("The employee ID for " + e.name() + " is " + e.id());
        }
    }
}
