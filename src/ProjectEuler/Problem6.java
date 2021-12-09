package ProjectEuler;

/*
 * The sum of the squares of the first ten natural numbers is: * 1 ^ 2 + 2 ^ 2 + ... + 10 ^ 2 = 385. The square of the
 * sum of the first ten natural numbers is: (1 + 2 + ... + 10) ^ 2 = 55 ^ 2 = 3025. Hence, the difference between the
 * sum of the squares of the first ten natural numbers and the square of the sum is: 3025 - 385 = 2640. Find the
 * difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=6
 */

class Problem6 {
    static int solve() {
        int sumOfFirst100NaturalNumbers = 100 * (100 + 1) / 2;
        int sumOfSquaresOfFirst100NaturalNumbers = 100 * (100 + 1) * (2 * 100 + 1) / 6;
        return (int) (Math.pow(sumOfFirst100NaturalNumbers, 2.0) - sumOfSquaresOfFirst100NaturalNumbers);
    }
}
