package Home_Work1.Test;

import Home_Work1.CyclesH1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CyclesH1Test {
    @Test
    public void test_sumAndQuantity() {
        String actual = CyclesH1.sumAndQuantity();
        String expected = "Even numbers quantity = 49, their sum = 2450";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_prime_primeNumber() {
        Boolean actual = CyclesH1.primeNumber(823);
        Boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_notPrime_primeNumber() {
        Boolean actual = CyclesH1.primeNumber(24);
        Boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
    
    @Test
    public void test_sqrSelect() {
        int  actual = CyclesH1.sqrSelect(322);
        int expected = 17;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_sqrtBinary() {
        int  actual = CyclesH1.sqrtBinary(87);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_3_factorial() {
        int actual = CyclesH1.factorial(6);
        int expected = 720;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void test_odd_sumOfDigits() {
        int actual = CyclesH1.sumOfDigits(2455);
        int expected = 16;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_even_sumOfDigits() {
        int actual = CyclesH1.sumOfDigits(-745);
        int expected = -16;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_even_mirroredNumber() {
        int actual = CyclesH1.mirroredNumber(456);
        int expected = 654;
        Assertions.assertEquals(actual, expected);
    }
    
    @Test
    public void test_odd_mirroredNumber() {
        int actual = CyclesH1.mirroredNumber(-654);
        int expected = -456;
        Assertions.assertEquals(actual, expected);

    }
}
