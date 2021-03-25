package Home_Work1.Test;
import Home_Work1.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FUNCTIONh1TEST {
    @Test
    public void test_5_getDayByNumber(){
        String actual = Function.getDayNameByNumber(3);
        String expected = "Wednesday";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_default_getDayByNumber(){
        String actual = Function.getDayNameByNumber(9);
        String expected = "Day number doesn't exist";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getDistance(){
        int actual = (int) Function.distanceBetweenTwoPoints(1, 2, 3, 4);
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getStringByNumber100(){
        String actual = Function.getStringFromNumber(100);
        String expected = "сто";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_getStringByNumber0(){
        String actual = Function.getStringFromNumber(0);
        String expected = "ноль";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_zero_getNumberByString(){
        int actual = Function.getNumberFromString("ноль");
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void test_125_getNumberByString(){
        int actual = Function.getNumberFromString("сто двадцать");
        int expected = 120;
        Assertions.assertEquals(actual, expected);
    }
}
