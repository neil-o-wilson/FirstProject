package com.nowilson


import spock.lang.Specification;

public class NumMinimumMovesDeterminerSpockTest extends Specification {

    void "test minimum moves to equalize two arrays of integers"() {
        expect: "the expected results"
        MinimumMovesDeterminer.minimumMoves(array1, array2) == expectedMoves

        where: "the inputs and expected results are as follows"
        array1      | array2        | expectedMoves
        [123, 935]  | [456, 321]    | 20
        [345, 111]  | [570, 111]    | 10
    }

    void "test minimum moves to equalize two equal digits is zero"() {
        expect: "expected results"
        MinimumMovesDeterminer.minimumMovesPerDigits(digit1, digit2) == 0

        where: "the inputs and expected results are as follows"
        digit1  | digit2
        1       | 1
        9       | 9
        0       | 0
        4       | 4
    }

    void "test minimum moves to equalize two non-equal digits where the first digit is smaller than the second"() {
        expect: "expected results"
        MinimumMovesDeterminer.minimumMovesPerDigits(digit1, digit2) == expectedMoves

        where: "the inputs and expected results are as follows"
        digit1  | digit2    | expectedMoves
        1       | 5         | 4
        3       | 9         | 6
        0       | 8         | 8
        2       | 4         | 2
        1       | 5         | 4
    }

    void "test minimum moves to equalize two non-equal digits where the first digit is larger than the second"() {
        expect: "expected results"
        MinimumMovesDeterminer.minimumMovesPerDigits(digit1, digit2) == expectedMoves

        where: "the inputs and expected results are as follows"
        digit1  | digit2    | expectedMoves
        5       | 1         | 4
        9       | 3         | 6
        8       | 0         | 8
        4       | 2         | 2
        5       | 1         | 4
    }
}
