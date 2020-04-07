package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2E. Test result : " + passed);
        in = 1340;
        expected = 19;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("1340 rubles are 19E. Test result : " + passed);
        in = 140;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2D. Test result : " + passed);
        in = 1240;
        expected = 20;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("1240 rubles are 20D. Test result : " + passed);
    }
}