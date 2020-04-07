package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance150() {
        int inx1 = 160;
        int iny1 = 13;
        int inx2 = 16;
        int iny2 = 55;
        double expected = 150.0;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance58() {
        int inx1 = 10;
        int iny1 = 18;
        int inx2 = 66;
        int iny2 = 35;
        double expected = 58.523;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance167() {
        int inx1 = 180;
        int iny1 = 83;
        int inx2 = 15;
        int iny2 = 57;
        double expected = 167.035;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance52() {
        int inx1 = 75;
        int iny1 = 16;
        int inx2 = 34;
        int iny2 = 49;
        double expected = 52.6307;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}