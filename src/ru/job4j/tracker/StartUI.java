package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        item.setName("mew");
        Tracker tracker = new Tracker();
        tracker.add(item);
        System.out.println(item.getId() + " " + item.getName());
        item = tracker.findById(1);
        System.out.println(item.getId() + " " + item.getName());
    }
}
