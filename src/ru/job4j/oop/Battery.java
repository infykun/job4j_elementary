package ru.job4j.oop;

public class Battery {
    private int load;
    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
    public Battery(int charge) {
        this.load = charge;
    }
    public static void main(String[] args) {
        Battery battery = new Battery(90);
        Battery another = new Battery(5);
        System.out.println("battery - " + battery.load + " another - " + another.load);
        battery.exchange(another);
        System.out.println("battery - " + battery.load + " another - " + another.load);
    }
}
