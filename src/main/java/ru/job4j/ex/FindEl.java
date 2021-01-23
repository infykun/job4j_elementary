package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException();
    }
    public static void main(String[] args) {
        String[] value = {"me", "wre", "ru", "boo"};
        try {
            indexOf(value, "boo");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        try {
            indexOf(value, "sdf");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}