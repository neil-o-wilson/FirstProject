package com.nowilson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


class NumCommonElementsDeterminer {

    public static int determineCommonElementsCount(int num1, int num2) {
        Set<Integer> set1 = toEvenDivisorElements(num1);
        Set<Integer> set2 = toEvenDivisorElements(num2);
        set1.retainAll(set2);
        return (set1.size());
    }

    private static Set<Integer> toEvenDivisorElements(int startingNum) {
        Set<Integer> results = new LinkedHashSet<Integer>();
        results.add(startingNum);
        int currentNum = startingNum;
        while (currentNum % 2 == 0) {
            currentNum = currentNum/2;
            results.add(currentNum);
        }
        return (results);
    }
}

