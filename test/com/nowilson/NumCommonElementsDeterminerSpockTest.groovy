package com.nowilson;

import spock.lang.*;

public class NumCommonElementsDeterminerSpockTest extends Specification {

    void "test array generation from number"() {
        expect: "expected results"
        NumCommonElementsDeterminer.toEvenDivisorElements(startingNum) == expectedResults

        where: "The inputs and expected results are as follows"
        startingNum | expectedResults
        8           | [8, 4, 2, 1] as Set
        32          | [32, 16, 8, 4, 2, 1] as Set
        7           | [7] as Set
    }

    void "test results for common inputs"() {
        expect: "the expected results"
        NumCommonElementsDeterminer.determineCommonElementsCount(num1, num2) == expectedResult

        where: "the inputs and expected results are as follows"
        num1    | num2  | expectedResult
        8       | 4     | 3
        8       | 7     | 0
        3       | 3     | 1
        8       | 8     | 4
    }
}
