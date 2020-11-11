package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void showallitem(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
    }
    public static void edititem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = Integer.valueOf(input.askStr("Enter id"));
        String name = input.askStr("Enter new name");
        Item item = new Item(name);
        boolean rsl = tracker.replace(id, item);
        if (rsl) {
            System.out.println("Item edited success");
        } else {
            System.out.println("Item edit failed");
        }
    }
    public static void deleteitem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = Integer.valueOf(input.askStr("Enter id"));
        boolean rsl = tracker.delete(id);
        if (rsl) {
            System.out.println("Item deleted success");
        } else {
            System.out.println("Item delete failed");
        }
    }
    public static void finditembyid(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int id = Integer.valueOf(input.askStr("Enter id"));
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Заявка с таким id не найдена");
        } else {
            System.out.println(item.getName() + " " + item.getId());
        }
    }
    public static void finditembyname(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter new name");
        Item[] items = tracker.findByName(name);
        if (items.length < 1) {
            System.out.println("Заявки с таким именем не найдены");
        } else {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getName() + " " + items[i].getId());
            }
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showallitem(input, tracker);
            } else if (select == 2) {
                StartUI.edititem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteitem(input, tracker);
            } else if (select == 4) {
                StartUI.finditembyid(input, tracker);
            } else if (select == 5) {
                StartUI.finditembyname(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}