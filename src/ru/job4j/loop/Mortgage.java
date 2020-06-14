package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double p = amount;
        while (p > 0) {
            p = p * percent / 100 + p - salary;
            year++;
        }
        return year;
    }
}