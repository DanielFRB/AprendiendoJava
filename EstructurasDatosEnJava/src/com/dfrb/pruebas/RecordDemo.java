package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

record Employee(String name, int id) {}

public class RecordDemo {
    public static void main(String[] args) {
        Employee[] empList = new Employee[4];
    
        empList[0] = new Employee("Doe, John", 1047);
        empList[1] = new Employee("Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel", 1049);
        empList[3] = new Employee("Martin, Dave", 1050);
    
        for(Employee e : empList) {
            System.out.println("El Id de empleado para " + e.name() + " es: " + e.id());
        }
    }
}
