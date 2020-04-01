package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(187);
        System.out.println("Man 187 is " + man);
        man = Fit.manWeight(150);
        System.out.println("Man 150 is " + man);
        double woman = Fit.womanWeight(187);
        System.out.println("Woman 187 is " + woman);
        woman = Fit.womanWeight(150);
        System.out.println("Woman 150 is " + woman);
    }

}
