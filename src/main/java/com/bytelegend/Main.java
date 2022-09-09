package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        int a1, b1;
        boolean c;
        a1 = Integer.valueOf(a);
        b1 = Integer.valueOf(b);
        c = a1 == b1;
        return c;
    }
}
