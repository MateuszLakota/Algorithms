package ProjectEuler;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is
 * the smallest positive number that is evenly divisible by all the numbers from 1 to 20?
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=5
 */

class Problem5 {
    static int solveProblem() {
        int leastCommonMultiple = 1;
        for (byte i = 2; i < 20; i++) {
            leastCommonMultiple = leastCommonMultiple * i / getGreatestCommonDivisor(leastCommonMultiple, i);
        }
        return leastCommonMultiple;
    }

    private static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return getGreatestCommonDivisor(number2, number1 % number2);
        }
    }
}
