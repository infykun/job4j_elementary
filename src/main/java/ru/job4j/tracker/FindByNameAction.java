package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter new name");
        Item[] items = tracker.findByName(name);
        if (items.length < 1) {
            System.out.println("Заявки с таким именем не найдены");
        } else {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getName() + " " + items[i].getId());
            }
        }
        return true;
    }
}