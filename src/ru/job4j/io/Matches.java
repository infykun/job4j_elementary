package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        int div;
        System.out.println("Возьмите 1, 2 или 3 спички");
        while (run) {
            System.out.println("На столе " + matches + " спичек");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Возьмите 1,2 или 3 спички");
            } else {
                div = matches - select;
                if (div < 0) {
                    System.out.println("На столе нет столько спичек, возьмите меньше");
                } else {
                    matches = div;
                }
            }
            if (matches == 0) {
                run = false;
                System.out.println("Игра окончена");
            }
        }

    }
}
