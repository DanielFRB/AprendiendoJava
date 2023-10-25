package com.dfrb.java8features.defaultstaticmeth;

/**
 * @author dfrb@ne
 */

public interface DefaultStaticInterfaceDemo {
    default void show() {
      System.out.println("In Java 8 - default method - DefaultStaticInterfaceDemo");
    }
    
    static void display() {
      System.out.println("In DefaultStaticInterfaceDemo I");
    }
}
