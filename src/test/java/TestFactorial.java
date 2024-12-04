import org.example.Factorial;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Factorial.factorial;

public class TestFactorial {

    @Test(testName = "Tест факториала 0")
    public void testFactorialOfZero() {
        assertEquals(Factorial.factorial(0), 1);
    }


    @Test(testName = "Tест факториала 3")
    void factorialTreeAssertTrueTest() {
        long factThree = factorial(3);
        assertEquals(6, factThree);
    }

    @Test(testName = "Tест на неверный факториал 3")
    void factorialThreeAssertFalseTest() {
        long factThree = factorial(3);
//        assertNotEquals(6, factThree);
        Assert.assertNotEquals(7, factThree);
    }

    @Test (testName = "Tест факториала 1")
    public void testFactorialOfOne() {
        assertEquals(Factorial.factorial(1), 1);
    }

    @Test ( testName = "Проверка на неотрицательность.")
    public void testFactorialPositiveNumber() {
        expectThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}