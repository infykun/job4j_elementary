package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int lindex = 0;
        int rindex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (rindex >= right.length || (lindex < left.length && left[lindex] < right[rindex])) {
                rsl[i] = left[lindex];
                lindex++;
            } else {
                rsl[i] = right[rindex];
                rindex++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
