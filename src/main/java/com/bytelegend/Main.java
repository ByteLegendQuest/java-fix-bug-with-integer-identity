package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        int i = Integer.valueOf(a);
        int j = Integer.valueOf(b);
        return i==j;
    }
}
