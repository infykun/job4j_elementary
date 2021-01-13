package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }


    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id"));
        String name = input.askStr("Enter new name");
        Item item = new Item(name);
        boolean rsl = tracker.replace(id, item);
        if (rsl) {
            out.println("Item edited success");
        } else {
            out.println("Item edit failed");
        }
        return true;
    }
}