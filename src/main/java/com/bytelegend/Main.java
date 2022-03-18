package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        String value1 = "";
        String value2 = "";
        for (int i = 0; i < a.length(); i++){
            if (Character.isDigit(a.charAt(i))) {
                value1 += a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++){
            if (Character.isDigit(b.charAt(i))) {
                value2 += b.charAt(i);
            }
        }
        return Integer.parseInt(value1) == Integer.parseInt(value2);
    }
}
