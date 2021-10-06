package ProjectEuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestProjectEuler {
    @Test
    void testSolveProblem1() {
        Assertions.assertEquals(233168, Problem1.solveProblem());
    }

    @Test
    void testSolveProblem2() {
        Assertions.assertEquals(4613732, Problem2.solveProblem());
    }

    @Test
    void testSolveProblem3() {
        Assertions.assertEquals(6857, Problem3.solveProblem());
    }

    @Test
    void testSolveProblem4() {
        Assertions.assertEquals(906609, Problem4.solveProblem());
    }

    @Test
    void testSolveProblem5() {
        Assertions.assertEquals(232792560, Problem5.solveProblem());
    }

    @Test
    void testSolveProblem6() {
        Assertions.assertEquals(25164150, Problem6.solveProblem());
    }

    @Test
    void testSolveProblem7() {
        Assertions.assertEquals(104743, Problem7.solveProblem());
    }
}
