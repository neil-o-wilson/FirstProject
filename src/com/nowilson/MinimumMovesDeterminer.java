package com.nowilson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

class MinimumMovesDeterminer {

    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger logger = Logger.getLogger(MinimumMovesDeterminer.class.getName());

    static {
        try {
            logManager.readConfiguration(new FileInputStream("config/first-project.properties"));
        } catch (IOException e) {
            logger.log(SEVERE, "Error in loading configuration file", e);
        }
    }
    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr1
     *  2. INTEGER_ARRAY arr2
     */
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        logger.info("\nMinimum number of moves to equalize arrays of numbers " + arr1.toString() + " and " + arr2.toString() + " ...");
        int numMoves = 0;
        int numElements = arr1.size();
        for(int i=0; i < numElements; i++) {
            numMoves += minimumMovesPerNumbers(arr1.get(i), arr2.get(i));
        }
        logger.info("... " + numMoves);
        return numMoves;
    }

    private static int minimumMovesPerNumbers(Integer num1, Integer num2) {
        String num1AsString = String.valueOf(num1);
        String num2AsString = String.valueOf(num2);
        int numLengths = num1AsString.length();
        logger.fine("\tMinimum number of moves to equalize numbers " + num1 + " and " + num2 + " ...");
        int numMoves = 0;
        for(int i=0; i < numLengths; i++) {
            numMoves += minimumMovesPerDigits(Integer.parseInt(String.valueOf(num1AsString.charAt(i))),
                Integer.parseInt(String.valueOf(num2AsString.charAt(i))));
        }
        logger.fine("\t ... " + numMoves);
         return numMoves;
    }

    private static int minimumMovesPerDigits(int digit1, int digit2) {
        int numMoves = (digit1 == digit2) ? 0 : Math.abs(digit1 - digit2);
        logger.fine("\t\tMinimum number of moves to equalize digits " + digit1 + " and " + digit2 + " is " + numMoves);
        return numMoves;
    }
}

