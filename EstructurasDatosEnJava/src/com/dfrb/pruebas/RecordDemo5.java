package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

record Employee5(String name, int id) {
    public Employee5 {
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
  
    public String lastName() {
        return name.substring(0, name.trim().indexOf(','));
    }
}

public class RecordDemo5 {
    public static void main(String[] args) {
        var emp = new Employee5("Jones, Robert", 1024);
    
        System.out.println("Employee full name is " + emp.name());
        System.out.println("Employee last name is " + emp.lastName());
    }
}
