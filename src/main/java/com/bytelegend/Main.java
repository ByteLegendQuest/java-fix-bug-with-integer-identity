package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        int i = Integer.parseInt(a);
        int i2 = Integer.parseInt(b);
        return i == i2;    
        }
}
