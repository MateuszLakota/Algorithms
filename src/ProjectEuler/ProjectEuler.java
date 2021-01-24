package ProjectEuler;

class ProjectEuler {
    private int solveProblem1() {
        /*
         * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
         * these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
         */

        int lastTermOf3AP = 1000 / 3;
        int valueOfTheLastTermOf3AP = 3 + (lastTermOf3AP - 1) * 3;
        int sumOf3AP = ((3 + valueOfTheLastTermOf3AP) / 2) * lastTermOf3AP;
        int sumOf3And5AP = sumOf3AP;

        for (int i = 5; i < 1000; i = i + 5) {
            if (i % 3 != 0) {
                sumOf3And5AP += i;
            }
        }
        return sumOf3And5AP;
    }
}
