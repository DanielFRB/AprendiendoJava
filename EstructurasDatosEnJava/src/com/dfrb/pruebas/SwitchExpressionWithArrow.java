package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

// Use the arrow "shorthand" to supply the priority level.
public class SwitchExpressionWithArrow {
    public static void main(String[] args) {
        int eventCode = 6010;
    
        int priorityLevel = switch(eventCode) {
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0;
        };
        System.out.println("Priority Level for event code " + eventCode + " is: " + priorityLevel);
    }
}
