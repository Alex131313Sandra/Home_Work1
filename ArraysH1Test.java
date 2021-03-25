package Home_Work1.Test;

import Home_Work1.ArraysH1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArraysH1Test {
    @Test
public void minElementTest() {
        int[] array = new int[]{1, 3, 5};
        int actual = ArraysH1.minElement(array);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minElementTest1() {
        int[] array = new int[]{0, -3, 5};
        int actual = ArraysH1.minElement(array);
        int expected = -3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxElementTest() {
        int[] array = new int[]{0, -3, 5};
        int actual = ArraysH1.maxElement(array);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void indexMinTest() {
        int[] array = new int[]{0, 25, 6, -20, 5};
        int actual = ArraysH1.indexMin(array);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void indexMinTest1() {
        int[] array = new int[]{0, -23, 25777, 666, -888, 5};
        int actual = ArraysH1.indexMin(array);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void indexMaxTest() {
        int[] array = new int[]{0, -89, 25, 611, -20, 5};
        int actual = ArraysH1.indexMax(array);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void indexMaxTest1() {
        int[] array = new int[]{ -899, 25566, 611, -203, 5};
        int actual = ArraysH1.indexMax(array);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oddIndexSumTest() {
        int[] array = new int[]{ -899, 25566, 611, -203, 5};
        int actual = ArraysH1.oddIndexSum(array);
        int expected = 25363;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oddIndexSumTest1() {
        int[] array = new int[]{ 999, 777, 555, 333, 111};
        int actual = ArraysH1.oddIndexSum(array);
        int expected = 1110;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        int[] array = new int[] {0, 2, 4, 8};
        int [] actual = ArraysH1.reverse(array);
        int [] expected = {8, 4, 2, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void quantityOfOddElementsTest(){
        int [] array = new int []{9, 2, 7, 4, 5};
        int actual = ArraysH1.quantityOfOddElements(array);
        int  expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_halfReverse(){
        int [] array = new int []{1, 2, 3, 4, 5};
        int[] actual = ArraysH1.halfReverse(array);
        int [] expected = {4, 5, 3, 1, 2};
        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void bubbleSortTest(){
        int [] array = new int []{721, 55, 7, -10, 87, 0, 46, 37};
        int [] actual = ArraysH1.bubbleSort(array);
        int [] expected = {-10, 0, 7, 37, 46, 55, 87, 721};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_selectionSort(){
        int [] array = new int []{721, 55, 7, -10, 87, 0, 46, 37};
        int [] actual = ArraysH1.selectionSort(array);
        int [] expected = {-10, 0, 7, 37, 46, 55, 87, 721};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_insertionSort(){
        int [] array = new int []{121, 24, -3, 10, 4, 1, 56, 7};
        int [] actual = ArraysH1.insertionSort(array);
        int [] expected = {-3, 1, 4, 7, 10, 24, 56, 121};
        Assertions.assertArrayEquals(actual, expected);
    }
}
