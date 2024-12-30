package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

record Employee3(String name, int id) {
    static int pendingId = -1;
  
    public Employee3 {
        name = name.trim();
    }
  
    public Employee3(String name) {
        this(name, pendingId);
    }
}

public class RecordDemo3 {
    public static void main(String[] args) {
        Employee3[] emplist2 = new Employee3[4];
    
        emplist2[0] = new Employee3("Doe, John", 1047);
        emplist2[1] = new Employee3("Jones, Robert", 1048);
        emplist2[2] = new Employee3("Smith, Rachel", 1049);
        emplist2[3] = new Employee3("Martin, Dave");
    
        for(Employee3 e : emplist2) {
            System.out.print("The employee ID for " + e.name() + " is ");
            if(e.id() == Employee3.pendingId) {
                System.out.println("Pending");
            } else {
                System.out.println(e.id());
            }
        }
    }
}
