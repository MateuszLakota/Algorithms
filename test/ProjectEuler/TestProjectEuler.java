package ProjectEuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestProjectEuler {
    @Test
    void testSolveProblem1() {
        Assertions.assertEquals(233168, Problem1.solveProblem1());
    }

    @Test
    void testSolveProblem2() {
        Assertions.assertEquals(4613732, Problem2.solveProblem2());
    }

    @Test
    void testSolveProblem3() {
        Assertions.assertEquals(6857, Problem3.solveProblem3());
    }
}
