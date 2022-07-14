package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SolutionTwo {

    public static String[] solution(String[] l) {
        ArrayList<String> ar = new ArrayList<String>();

        for (int i = 0; i < l.length; i++)
            ar.add(base100(l[i]));

        Collections.sort(ar);

        for (int i = 0; i < l.length; i++)
            l[i] = base10(ar.get(i));

        return l;
    }

    public static void Sort() {
        ArrayList<String> ar = new ArrayList<String>();
    }

    public static String base100(String s) {
        String[] sa = s.split("\\.");
        String x = "";
        for (int i = 0; i < sa.length; i++)
            x = x + String.valueOf((char) Integer.parseInt(sa[i])) + ".";

        x = x.substring(0,x.length()-1);

        return x;
    }

    public static String base10(String s) {
        String[] sa = s.split("\\.");
        String x = "";
        for (int i = 0; i < sa.length; i++)
            x = x + String.valueOf((int)sa[i].charAt(0)) + ".";

        x = x.substring(0,x.length()-1);

        return x;
    }
}
