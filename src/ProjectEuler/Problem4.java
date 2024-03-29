package ProjectEuler;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=4
 */

class Problem4 {
    static int solve() {
        int largestPalindrome = 0;
        int product;
        for (short i = 999; i >= 100; i--) {
            for (short j = 999; j >= 100; j--) {
                product = i * j;
                if (product > largestPalindrome && i * j == getInvertedNumber(i * j)) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }

    private static int getInvertedNumber(int number) {
        int invertedNumber = 0;
        while (number > 0) {
            invertedNumber = invertedNumber * 10 + number % 10;
            number /= 10;
        }
        return invertedNumber;
    }
}
