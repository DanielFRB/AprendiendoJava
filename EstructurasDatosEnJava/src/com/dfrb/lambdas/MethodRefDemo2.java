package com.dfrb.lambdas;

interface StringFunc3 {
    String func(String s);
}

class MyStringOps2 {
    String strReverse(String s) {
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}

public class MethodRefDemo2 {
    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();

        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Here's the input string: " + inStr);
        System.out.println("Here's the output string: " + outStr);
    }
}
