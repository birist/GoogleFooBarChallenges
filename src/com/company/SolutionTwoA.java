package com.company;

public class SolutionTwoA {

    public static String solution(long x, long y) {
        return Long.toString(moveY(x,y,moveX(x)));
    }

    public static long moveX(long x) {
        int b = 0;
        for (int i = 0; i <= x; i++)
            b += i;
        return b;
    }

    public static long moveY(long x, long y, long z) {
        if (y == 0)
            return z;

        for (int i = 0; i < y-1; i++)
            z += x+i;

        return z;
    }
}
