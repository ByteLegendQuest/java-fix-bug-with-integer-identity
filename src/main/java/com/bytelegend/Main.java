package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        return Integer.parseInt(a) == Integer.parseInt(b);
    }
    //Integer.valueOf()除了调用parseInt()，又经过包装，返回的是Integer对象，
    //而Integer.parseInt()仅调用parseInt()，返回的是int类型的值
}
