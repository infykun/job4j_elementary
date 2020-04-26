package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int div = word.length - post.length;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[i + div] != post[i]) {
                result = false;
                break;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}