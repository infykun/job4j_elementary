package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactLessZero() {
        Fact.calc(-2);
    }

    @Test
    public void whenFactMoreZero() {
        int rsl = Fact.calc(2);
        assertThat(rsl, is(2));
    }
}