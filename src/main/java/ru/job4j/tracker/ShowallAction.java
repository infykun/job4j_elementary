package ru.job4j.tracker;

public class ShowallAction implements UserAction {
    private final Output out;

    public ShowallAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }


    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            out.println(items[i].getId() + " " + items[i].getName());
        }
        return true;
    }
}