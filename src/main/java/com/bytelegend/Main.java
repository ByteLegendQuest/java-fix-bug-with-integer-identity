package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        int aa = 0,bb = 0;
        if (a.contains("-")){
            a=a.replace("-", "");
            aa = -Integer.valueOf(a);
        }
        if (b.contains("-")){
            b=b.replace("-", "");
            bb = -Integer.valueOf(b);
        }
        return aa == bb;
    }
}
