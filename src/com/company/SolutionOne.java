package com.company;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionOne {

    public static int solution(int[] x, int[] y) {
        ArrayList<Integer> xL = new ArrayList<Integer>(x.length);
        ArrayList<Integer> yL = new ArrayList<Integer>(y.length);

        for (int i : x) {
            xL.add(i);
        }

        for (int i : y) {
            yL.add(i);
        }

        for (int i : xL)
        {
            if (yL.contains(i) == false) {
                return i;
            }
        }
        for (int j : yL) {
            if (xL.contains(j) == false) {
                return j;
            }
        }
        return 0;
    }

    public static String variation(String s) {
        char[] cA;
        cA = s.toCharArray();
        Pattern p = Pattern.compile("[a-z]");

        for (int i = 0; i < cA.length; i++) {
            Matcher m = p.matcher(Character.toString(cA[i]));
            if (m.find())
                cA[i] = (char)(219 - ((int) cA[i]));
        }

        return new String(cA);
    }
}
