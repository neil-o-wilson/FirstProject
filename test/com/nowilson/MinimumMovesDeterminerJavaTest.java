package com.nowilson;

import java.util.Arrays;
import java.util.List;

public class MinimumMovesDeterminerJavaTest {
    public static void main(String[] args) {
        doTest(Arrays.asList(new Integer[]{123, 935}), Arrays.asList(new Integer[]{456, 321}), 20);
        doTest(Arrays.asList(new Integer[]{345, 111}), Arrays.asList(new Integer[]{570, 111}), 10);
    }

    private static void doTest(List<Integer> arr1, List<Integer> arr2, int expectedMoves) {
        System.out.println("Entered doTest() with arr1 as : " + arr1 + ", arr2 as " + arr2 + ", expectedMoves as " + expectedMoves);
        int actualMoves = MinimumMovesDeterminer.minimumMoves(arr1, arr2);
        System.out.println("Calculated minimumMoves as " + actualMoves);
        assert actualMoves == expectedMoves : "numMoves should be " + expectedMoves + " but is " + actualMoves;
    }
}
