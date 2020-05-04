package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int y = 0; y < array.length; y++)
        {
            for (int x = 0; x < array[0].length; x++) {
                array[y][x] = y * 3 + x + 1;
            }
        }
    }
}
