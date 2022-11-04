package com.nowilson;

import java.util.*;


class MinimumMovesDeterminer {

    private static final int MIN_ARRAY_SIZE = 1;

    private static final int MAX_ARRAY_SIZE = (int) Math.pow(10, 5);

    private static final int MIN_NUM = 1;

    private static final int MAX_NUM = (int) Math.pow(10, 9);

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr1
     *  2. INTEGER_ARRAY arr2
     */

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        // Write your code here
        int numMoves = 0;
        int numElements = arr1.size();

        for(int i=0; i < numElements; i++) {
            numMoves += minimumMovesPerNumbers(arr1.get(i), arr2.get(i));
        }

        return (numMoves);
    }

    private static int minimumMovesPerNumbers(Integer num1, Integer num2) {
        String num1AsString = String.valueOf(num1);
        String num2AsString = String.valueOf(num2);
        int numLengths = num1AsString.length();

        int numMoves = 0;
        for(int i=0; i < numLengths; i++) {
            numMoves += minimumMovesPerDigits(Integer.parseInt(String.valueOf(num1AsString.charAt(i))),
                Integer.parseInt(String.valueOf(num2AsString.charAt(i))));
        }

        return (numMoves);
    }

    private static int minimumMovesPerDigits(int digit1, int digit2) {
        int numMoves = 0;

        if (digit1 > digit2) {
            numMoves = digit1 - digit2;
        }
        else if (digit2 > digit1) {
            numMoves = digit2 - digit1;
        }

        return (numMoves);
    }
}

