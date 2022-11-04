package com.nowilson;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MinimumMovesDeterminerJunitTest {
    @Test
    void testBlah() {
        List<Integer> arr1 = Arrays.asList(new Integer[]{123, 935});
        List<Integer> arr2 = Arrays.asList(new Integer[]{456, 321});
        int expectedMoves = 20;
        int actualMoves = MinimumMovesDeterminer.minimumMoves(arr1, arr2);
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    void testBlah1() {
        List<Integer> arr1 = Arrays.asList(new Integer[]{345, 111});
        List<Integer> arr2 = Arrays.asList(new Integer[]{570, 111});
        int expectedMoves = 10;
        int actualMoves = MinimumMovesDeterminer.minimumMoves(arr1, arr2);
        assertEquals(expectedMoves, actualMoves);
    }
}
