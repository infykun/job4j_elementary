package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter new name");
        Item[] items = tracker.findByName(name);
        if (items.length < 1) {
            out.println("Заявки с таким именем не найдены");
        } else {
            for (int i = 0; i < items.length; i++) {
                out.println(items[i].getName() + " " + items[i].getId());
            }
        }
        return true;
    }
}