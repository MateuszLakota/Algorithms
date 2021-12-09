package ProjectEuler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestProjectEuler {
    @Test
    void testProblem1Solve() {
        Assertions.assertEquals(233168, Problem1.solve());
    }

    @Test
    void testProblem2Solve() {
        Assertions.assertEquals(4613732, Problem2.solve());
    }

    @Test
    void testProblem3Solve() {
        Assertions.assertEquals(6857, Problem3.solve());
    }

    @Test
    void testProblem4Solve() {
        Assertions.assertEquals(906609, Problem4.solve());
    }

    @Test
    void testProblem5Solve() {
        Assertions.assertEquals(232792560, Problem5.solve());
    }

    @Test
    void testProblem6Solve() {
        Assertions.assertEquals(25164150, Problem6.solve());
    }

    @Test
    void testProblem7Solve() {
        Assertions.assertEquals(104743, Problem7.solve());
    }

    @Test
    void testProblem8Solve() {
        Assertions.assertEquals(23514624000L, Problem8.solve());
    }
}
