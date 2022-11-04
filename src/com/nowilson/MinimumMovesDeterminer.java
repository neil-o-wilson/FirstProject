package com.nowilson;

import java.util.*;
import com.nowilson.utils.LogLevelEnum;


class MinimumMovesDeterminer {

    public static LogLevelEnum logLevel = LogLevelEnum.INFO;

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr1
     *  2. INTEGER_ARRAY arr2
     */
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        if (logLevel.ordinal() >= LogLevelEnum.INFO.ordinal()) {
            System.out.println("\nMinimum number of moves to equalize arrays of numbers " + arr1.toString() + " and " + arr2.toString() + " ...");
        }
        int numMoves = 0;
        int numElements = arr1.size();
        for(int i=0; i < numElements; i++) {
            numMoves += minimumMovesPerNumbers(arr1.get(i), arr2.get(i));
        }
        if (logLevel.ordinal() >= LogLevelEnum.INFO.ordinal()) {
            System.out.println("... " + numMoves);
        }
        return (numMoves);
    }

    private static int minimumMovesPerNumbers(Integer num1, Integer num2) {
        String num1AsString = String.valueOf(num1);
        String num2AsString = String.valueOf(num2);
        int numLengths = num1AsString.length();
        if (logLevel.ordinal() >= LogLevelEnum.DEBUG.ordinal()) {
            System.out.println("\tMinimum number of moves to equalize numbers " + num1 + " and " + num2 + " ...");
        }
        int numMoves = 0;
        for(int i=0; i < numLengths; i++) {
            numMoves += minimumMovesPerDigits(Integer.parseInt(String.valueOf(num1AsString.charAt(i))),
                Integer.parseInt(String.valueOf(num2AsString.charAt(i))));
        }
        if (logLevel.ordinal() >= LogLevelEnum.DEBUG.ordinal()) {
            System.out.println("\t ... " + numMoves);
        }
         return (numMoves);
    }

    private static int minimumMovesPerDigits(int digit1, int digit2) {
        int numMoves = (digit1 == digit2) ? 0 : Math.abs(digit1 - digit2);
        if (logLevel.ordinal() >= LogLevelEnum.DEBUG.ordinal()) {
            System.out.println("\t\tMinimum number of moves to equalize digits " + digit1 + " and " + digit2 + " is " + numMoves);
        }
        return numMoves;
    }
}

