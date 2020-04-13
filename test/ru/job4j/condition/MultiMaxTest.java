package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondMax7() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 4, 2);
        assertThat(result, is(7));
    }
    @Test
    public void whenSecondMax10() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 8, 10);
        assertThat(result, is(10));
    }
    @Test
    public void whenSecondMax15() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 15, 15);
        assertThat(result, is(15));
    }
}