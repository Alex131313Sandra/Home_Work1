package Home_Work1.Test;
import Home_Work1.ConditionalStatments;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalStatementsTest {
    @Test
    public void calcNumbersTest(){
        int actual = ConditionalStatments.calcNumbersSumOrMultiply(5,5);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumbersTest1(){
        int actual = ConditionalStatments.calcNumbersSumOrMultiply(8,11);
        int expected = 88;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumbersTest2(){
        int actual = ConditionalStatments.calcNumbersSumOrMultiply(-23,5);
        int expected = -18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumbersTest3(){
        int actual = ConditionalStatments.calcNumbersSumOrMultiply(0,5);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcCoordinatesQuater(){
        String actual = ConditionalStatments.calcCoordinatesQuater(0,5);
        String expected = "on the axis y between I and II";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcCoordinatesQuater1(){
        String actual = ConditionalStatments.calcCoordinatesQuater(9,5);
        String expected = "I quarter";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcCoordinatesQuater2(){
        String actual = ConditionalStatments.calcCoordinatesQuater(7,0);
        String expected = "on the axis x between I and IV";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcCoordinatesQuater3(){
        String actual = ConditionalStatments.calcCoordinatesQuater(-9,-8);
        String expected = "III quarter";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcPositiveNumbers() {
        int actual = ConditionalStatments.calcPositiveNumbers(2, 4, 7);
        int expected = 13;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcPositiveNumbers1() {
        int actual = ConditionalStatments.calcPositiveNumbers(0, 0, 0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcPositiveNumbers2() {
        int actual = ConditionalStatments.calcPositiveNumbers(5, -8, 4);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcPositiveNumbers3() {
        int actual = ConditionalStatments.calcPositiveNumbers(-2, -8, 4);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numMax() {
        int actual = ConditionalStatments.numMax(45,7,88);
        int expected = 27723;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numMax1() {
        int actual = ConditionalStatments.numMax(8,24,-7);
        int expected = 28;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numMax2() {
        int actual = ConditionalStatments.numMax(0,5,-8);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMark() {
        String actual = ConditionalStatments.getMark(54);
        String expected = "D";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMark1() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatments.getMark(200),
                "Число должно быть больше 0 и меньше 100");
    }

    @Test
    public void getMark2() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> ConditionalStatments.getMark(-13),
                "Число должно быть больше 0 и меньше 100");
    }

    @Test
    public void getMark3() {
        String actual = ConditionalStatments.getMark(91);
        String expected = "A";
        Assertions.assertEquals(expected, actual);
    }
}
