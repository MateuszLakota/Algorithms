package ProjectEuler;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143?
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=3
 */

class Problem3 {
    static short solveProblem3() {
        long number = 600851475143L;
        short largestPrimeFactor;
        for (largestPrimeFactor = 2; largestPrimeFactor <= number; largestPrimeFactor++) {
            if (number % largestPrimeFactor == 0) {
                number /= largestPrimeFactor;
                largestPrimeFactor--;
            }
        }
        return largestPrimeFactor;
    }
}
