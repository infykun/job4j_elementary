package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(1, 2);
        Point bp = new Point(2, 2);
        Point cp = new Point(2, 3);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(0.5, result, 0.01);
    }
    @Test
    public void whenExist1() {
        Point ap = new Point(1, 2);
        Point bp = new Point(2, 2);
        Point cp = new Point(2, 5);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(1.5, result, 0.01);
    }
    @Test
    public void whenExist2() {
        Point ap = new Point(1, 2);
        Point bp = new Point(2, 2);
        Point cp = new Point(3, 2);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(-1, result, 0.01);
    }
    @Test
    public void whenExist3() {
        Point ap = new Point(1, 2);
        Point bp = new Point(2, 20);
        Point cp = new Point(20, 3);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(170.5, result, 0.01);
    }
}