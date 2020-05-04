package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}