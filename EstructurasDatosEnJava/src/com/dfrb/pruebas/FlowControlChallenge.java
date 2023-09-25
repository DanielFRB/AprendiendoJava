package com.dfrb.pruebas;

/**
 * @author dfrb@ne
 */

public class FlowControlChallenge {
    public static void main(String... doYourBest) {
        boolean amIFat;
        boolean isDinnerPrank = false;
        
        int result = 0;
        
        if (amIFat = true || (isDinnerPrank = true)) {
            result++;
            amIFat = false;
        }
        
        if (amIFat || isDinnerPrank && (isDinnerPrank = false || amIFat)) {
            result++; // Ambas variables son falsas y no se ejecuta el codigo dentro del if
        }
        
        if (!amIFat && !isDinnerPrank) {
            result++;
        }
        
        System.out.println(String.valueOf(result) + amIFat + isDinnerPrank);
    }
}
