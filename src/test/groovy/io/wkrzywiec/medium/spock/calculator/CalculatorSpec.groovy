package io.wkrzywiec.medium.spock.calculator

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "Multiplication operation"(){

        expect: "multiply two values"
        Calculator.multiply(first, second) == result

        where: "sample data"
        first   |   second  ||  result
        1       |   1       ||  1
        2       |   -1      ||  -2
        -2      |   -2      ||  4
    }
}