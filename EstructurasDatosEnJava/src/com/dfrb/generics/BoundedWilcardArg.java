package com.dfrb.generics;

// Bounded Wildcard arguments.
class TwoDims {
    int x, y;
  
    TwoDims(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeDims extends TwoDims {
    int z;

    ThreeDims(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourDims extends ThreeDims {
    int t;

    FourDims(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends TwoDims> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

public class BoundedWilcardArg {
    static void showXY(Coords<?> c) {
        System.out.println("Coordenadas X, Y:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeDims> c) {
        System.out.println("Coordenadas X, Y, Z:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourDims> c) {
        System.out.println("Coordenadas X, Y, Z, T:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoDims[] td = {
            new TwoDims(0, 0),
            new TwoDims(7, 9),
            new TwoDims(22, 6),
            new TwoDims(12, 8)
        };
    
        Coords<TwoDims> tdlocs = new Coords<TwoDims>(td);
        System.out.println("Contenido de tdlocs.");
        showXY(tdlocs);

        FourDims[] fd = {
            new FourDims(1, 2, 3, 4),
            new FourDims(8, 4, 2, -1),
            new FourDims(24, 12, 10, 24),
            new FourDims(3, -2, -8, 14)
        };
    
        Coords<FourDims> fdlocs = new Coords<FourDims>(fd);
        System.out.println("Contenido de fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
