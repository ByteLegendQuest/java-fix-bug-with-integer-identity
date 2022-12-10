package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        //过滤一下，用新的String
        int x = -1;
        int y = -1;
        try{
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
        }catch(Exception e) {
            y = Integer.parseInt(b.substring(1,b.length()));
        }
        return x==y;
    }
}
