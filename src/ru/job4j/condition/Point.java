package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xd = x2 - x1;
        double yd = y2 - y1;
        xd = Math.pow(xd, 2);
        yd = Math.pow(yd, 2);
        double rsl = xd + yd;
        rsl = Math.sqrt(rsl);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 0, 2, 0);
        System.out.println("result (1, 0) to (2, 0) " + result);
        result = Point.distance(0, 2, 2, 0);
        System.out.println("result (0, 2) to (2, 0) " + result);
        result = Point.distance(5, 0, 0, 0);
        System.out.println("result (5, 0) to (0, 0) " + result);
        result = Point.distance(0, 0, 0, 10);
        System.out.println("result (0, 0) to (0, 10) " + result);
        result = Point.distance(4, 4, 10, 4);
        System.out.println("result (4, 4) to (10, 4) " + result);
        result = Point.distance(111, 222, 333, 666);
        System.out.println("result (111, 222) to (333, 666) " + result);
    }
}