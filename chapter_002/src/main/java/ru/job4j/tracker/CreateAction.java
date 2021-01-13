package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "==== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Store store) {
        String name = input.askStr("Enter name:");
        Item item = new Item(name);
        store.add(item);
        return true;
    }
}
