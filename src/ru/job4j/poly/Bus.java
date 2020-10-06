package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int n) {

    }

    @Override
    public int fuel(int litr) {
        return litr * 20;
    }
}
