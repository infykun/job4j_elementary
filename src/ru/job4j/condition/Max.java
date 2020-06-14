package ru.job4j.condition;

public class Max {
    public static int max(int d1, int d2) {
        int result = d1 > d2 ? d1 : d2;
        return result;
    }
    public static int max(int d1, int d2, int d3) {
        int result = max(max(d1, d2), d3);
        return result;
    }
    public static int max(int d1, int d2, int d3, int d4) {
        int result = max(max(d1, d2, d3), d4);
        return result;
    }
}