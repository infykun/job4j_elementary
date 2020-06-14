package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance150() {
        Point point1 = new Point(160, 13);
        Point point2 = new Point(15, 55);
        double expected = 150.96;
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance58() {
        Point point1 = new Point(10, 18);
        Point point2 = new Point(66, 35);
        double expected = 58.523;
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance167() {
        Point point1 = new Point(180, 83);
        Point point2 = new Point(15, 57);
        double expected = 167.035;
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance52() {
        Point point1 = new Point(75, 16);
        Point point2 = new Point(34, 49);
        double expected = 52.6307;
        double out = point2.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}