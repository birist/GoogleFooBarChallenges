package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionThree {

    public static String solution(int[] xs) {
        List<Integer> ar = Arrays.stream(xs).boxed().collect(Collectors.toList()); //dumb

        if (xs.length > 50)
            return "0";
        if (xs.length <1)
            return "0";

        Collections.sort(ar);

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > 1000)
                ar.set(i,1000);
            if (ar.get(i) < -1000)
                ar.set(i,-1000);
        }

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 0) {
                for (int j = i + 1; j < ar.size(); j++){
                    if (ar.get(j) < 0) {
                        ar.set(i,ar.get(i)*(-1));
                        ar.set(j,ar.get(j)*(-1));
                        break; //lazy
                    }
                }
            }
        }

        BigInteger totalpower = new BigInteger("1");
        Collections.sort(ar);
        for (int i = 1; i < ar.size(); i++) {
            if (ar.get(i) > 0)
                totalpower = totalpower.multiply(BigInteger.valueOf(ar.get(i)));
            else
                totalpower = totalpower.subtract(BigInteger.valueOf((ar.get(i))));
        }

        return totalpower.toString();
    }
}
