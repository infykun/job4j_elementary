package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        Turn turner = new Turn();
        int[] input = new int[] {8, 5, 7, 3, 54, 2, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 2, 54, 3, 7, 5, 8};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray2() {
        Turn turner = new Turn();
        int[] input = new int[] {3, 6, 2, 5, 7, 8};
        int[] result = turner.back(input);
        int[] expect = new int[] {8, 7, 5, 2, 6, 3};
        assertThat(result, is(expect));
    }
}