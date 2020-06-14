package ru.job4j.condition;

public class Max {
    public static int max(int d1, int d2) {
        return d1 > d2 ? d1 : d2;
    }
    public static int max(int d1, int d2, int d3) {
        return max(max(d1, d2), d3);
    }
    public static int max(int d1, int d2, int d3, int d4) {
        return max(max(d1, d2, d3), d4);
    }
}