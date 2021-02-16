package ProjectEuler;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
 * these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Source: https://projecteuler.net/problem=1
 * Copyright © 2021 ProjectEuler.net
 */

public class Problem1 {
    static int solveProblem1() {
        int sumOf3And5ArithmeticProgressionsTerms = Problem1.countSumOf3ArithmeticProgressionTerms();
        for (short i = 5; i < 1000; i = (short) (i + 5)) {
            if (i % 3 != 0) {
                sumOf3And5ArithmeticProgressionsTerms += i;
            }
        }
        return sumOf3And5ArithmeticProgressionsTerms;
    }

    private static int countSumOf3ArithmeticProgressionTerms() {
        short lastTermOf3ArithmeticProgression = 1000 / 3;
        short valueOfTheLastTermOf3ArithmeticProgression = (short) (3 +
                (lastTermOf3ArithmeticProgression - 1) * 3);
        return ((3 + valueOfTheLastTermOf3ArithmeticProgression) / 2) * lastTermOf3ArithmeticProgression;
    }
}
