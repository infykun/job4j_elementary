package ru.job4j.tracker;

public class Item {
    String id;
    String name;
    public Item() {
    }
    public Item(String idIn) {
        id = idIn;
    }
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Item item = new Item();
        Item itemId = new Item("mu");
        Item itemIdName = new Item("mu", "cow");
    }
}