package com.dfrb.clasespropias;

/**
 * @author danfe
 */

public class Jefe extends Empleado {
    public Jefe(String n, int e, double s) {
        super(n, e, s);
    }
    
    double incentivo(double inc) {
        return inc;
    }
}
