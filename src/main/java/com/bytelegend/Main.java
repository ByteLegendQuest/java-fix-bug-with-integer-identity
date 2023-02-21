package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    public static boolean numberEquals(String a, String b) {
        int ia = 0, ib = 0;
        int lena = a.length();
        int lenb = b.length();

        char[] aa = a.toCharArray();
        char[] ab = b.toCharArray();

        if (aa[0] == '+') {
            ia = 1;
        }
        if (bb[0] == '+') {
            ib = 1;
        }

        for (; ia < lena && ib < lenb; ia++, ib++) {
            if (aa[ia] != ab[ib]) {
                return false;
            }
        }
        return true;
    }
}
