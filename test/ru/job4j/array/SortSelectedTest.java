package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] {4, 2, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort5() {
        int[] input = new int[] {4, 6, 8, 9, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 8, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort10() {
        int[] input = new int[] {1, 5, 2, 3, 8, 9, 22, 12, 32, 45};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 5, 8, 9, 12, 22, 32, 45};
        assertThat(result, is(expect));
    }
}