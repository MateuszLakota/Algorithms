package ProjectEuler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. What is the
 * 10001st prime number?
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=7
 */

class Problem7 {
    static int solveProblem() {
        short numberOfPrimeNumbers = 6;
        int soughtPrimeNumber = 0;
        outerLoop:
        for (int i = 15; numberOfPrimeNumbers < 10001; i += 2) {
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    continue outerLoop;
                }
            }
            numberOfPrimeNumbers++;
            soughtPrimeNumber = i;
        }
        return soughtPrimeNumber;
    }
}
