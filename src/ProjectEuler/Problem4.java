package ProjectEuler;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Copyright © 2021 ProjectEuler.net
 * Source: https://projecteuler.net/problem=4
 */

class Problem4 {
    static int solveProblem() {
        int largestPalindrome = 0;
        int product;
        for (short i = 100; i < 1000; i++) {
            for (short j = 100; j < 1000; j++) {
                product = i * j;
                String possiblePalindrome = String.valueOf(product);
                if (product > largestPalindrome && possiblePalindrome.equals(new StringBuilder(possiblePalindrome)
                        .reverse().toString())) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }
}
