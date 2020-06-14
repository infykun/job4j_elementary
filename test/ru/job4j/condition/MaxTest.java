package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax8To2Then8() {
        int result = Max.max(8, 2);
        assertThat(result, is(8));
    }
    @Test
    public void whenMax1To5Then5() {
        int result = Max.max(1, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax6To6Then6() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax3d1() {
        int result = Max.max(4, 2, 8);
        assertThat(result, is(8));
    }
    @Test
    public void whenMax3d2() {
        int result = Max.max(4, 15, 8);
        assertThat(result, is(15));
    }
    @Test
    public void whenMax4d1() {
        int result = Max.max(4, 15, 8, 18);
        assertThat(result, is(18));
    }
}