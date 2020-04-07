package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void square2() {
        int inp = 6;
        int ink = 2;
        double expected = 2;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square20() {
        int inp = 8;
        int ink = 2;
        double expected = 2;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square5() {
        int inp = 15;
        int ink = 5;
        double expected = 5;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square1() {
        int inp = 4;
        int ink = 1;
        double expected = 1;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square147() {
        int inp = 60;
        int ink = 3;
        double expected = 147;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
}