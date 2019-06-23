package calculator.com.epam.tat.module4;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {

    private final double A_DOUBLE = 1234.08;
    private final double B_DOUBLE = 7.74;

    private final long A_LONG = 12345L;
    private final long B_LONG = 7652341L;

    @Test
    public void testSumLong() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sum(A_LONG, B_LONG), A_LONG + B_LONG);
    }

    @Test
    public void testSumDouble() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sum(A_DOUBLE, B_DOUBLE),(A_DOUBLE + B_DOUBLE));
    }

    @Test
    public void testSubLong() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sub(A_LONG, B_LONG), A_LONG - B_LONG);
    }

    @Test
    public void testSubDouble() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sub(A_DOUBLE, B_DOUBLE),(A_DOUBLE - B_DOUBLE));
    }

    @Test
    public void testMultLong() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.mult(A_LONG, B_LONG), A_LONG * B_LONG);
    }

    @Test
    public void testMultDouble() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.mult(A_DOUBLE, B_DOUBLE),(A_DOUBLE * B_DOUBLE));
    }

    @Test
    public void testDivLong() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.div(A_LONG, B_LONG), A_LONG / B_LONG);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivLongCatchException() {
        Calculator calculator1 = new Calculator();
        calculator1.div(A_LONG, 0L);
    }

    @Test
    public void testDivDouble() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals( calculator1.div(A_DOUBLE, B_DOUBLE),(A_DOUBLE / B_DOUBLE));
    }

    @Test
    public void testPow() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.pow(A_DOUBLE, B_DOUBLE),Math.pow(A_DOUBLE, B_DOUBLE));
    }

    @Test
    public void testSqrt() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sqrt(-A_DOUBLE),Math.sqrt(Math.abs(-A_DOUBLE)));
    }

    @Test
    public void testCos() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.cos(A_DOUBLE),Math.cos(A_DOUBLE));
    }

    @Test
    public void testSin() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.sin(A_DOUBLE),Math.sin(A_DOUBLE));
    }


    @Test
    public void testTg() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.tg(A_DOUBLE),Math.tan(A_DOUBLE));
    }

    @Test
    public void testCtg() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator1.ctg(A_DOUBLE),1 / (Math.tan(A_DOUBLE)) );
    }

    @Test
    public void testIsPositive() {
        Calculator calculator1 = new Calculator();
        Assert.assertTrue(calculator1.isPositive(A_LONG));
    }

    @Test
    public void testIsNegative() {
        Calculator calculator1 = new Calculator();
        Assert.assertFalse(calculator1.isNegative(B_LONG));
    }
}


