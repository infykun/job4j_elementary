package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] arrayLocal) {
        array = arrayLocal;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] arrayLocal = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(arrayLocal);
        reduce.print();
    }
}