package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        char fa = a.charAt(0), fb = b.charAt(0);
        String aa, bb;
        int ta = 1, tb = 1;
        if(fa == '+') aa = a.substring(1);
        else if(fa == '-') {
            aa = a.substring(1);
            ta = -1;
        } else aa = a;

        if(fb == '+') bb = b.substring(1);
        else if(fb == '-') {
            bb = b.substring(1);
            tb = -1;
        }
        else bb = b;


        return ta * Integer.valueOf(aa) ==  tb * Integer.valueOf(bb);
    }
}
