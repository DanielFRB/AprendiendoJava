package com.dfrb.lambdas;

interface StringFunc {
    String func(String s);
}

public class LambdasAsArgumentsDemo {
    static String StringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
    
        System.out.println("Here's the input string: " + inStr);
    
        outStr = StringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The String in Uppercase: " + outStr);

        outStr = StringOp((str) -> {
            String res = "";
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ') {
                    res += str.charAt(i);
                }
            }
            return res;
        }, inStr);
        System.out.println("The String without spaces: " + outStr);

        StringFunc reverse = (str) -> {
            String res = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        System.out.println("The String reversed: " + StringOp(reverse, inStr));
    }
}
