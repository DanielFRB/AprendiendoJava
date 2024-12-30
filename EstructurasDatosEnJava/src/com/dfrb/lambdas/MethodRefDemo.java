package com.dfrb.lambdas;

interface StringFunc2 {
    String func(String s);
}

class MyStringOps {
    static String strReverse(String s) {
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}

public class MethodRefDemo {
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Here's the input string: " + inStr);
        System.out.println("Here's the output string: " + outStr);
    }
}
