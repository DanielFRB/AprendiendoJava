package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

record Employee2(String name, int id) {
    public Employee2 {
        name = name.trim();
    }
}

public class RecordDemo2 {
    public static void main(String[] args) {
        Employee2[] empList = new Employee2[4];
    
        empList[0] = new Employee2("Doe, John", 1047);
        empList[1] = new Employee2(" Jones, Robert", 1048);
        empList[2] = new Employee2("Smith, Rachel ", 1049);
        empList[3] = new Employee2(" Martin, Dave ", 1050);
    
        for(Employee2 e: empList) {
            System.out.println("The employee ID for " + e.name() + " is " + e.id());
        }
    }
}
