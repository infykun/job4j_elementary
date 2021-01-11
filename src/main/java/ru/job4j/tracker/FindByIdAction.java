package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find By ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id"));
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Заявка с таким id не найдена");
        } else {
            System.out.println(item.getName() + " " + item.getId());
        }
        return true;
    }
}