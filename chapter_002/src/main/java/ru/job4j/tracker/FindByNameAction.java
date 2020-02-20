package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name of item to find");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("There is no items with this name: " + name);
        } else {
            System.out.println("List of items that was found: ");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + 1 + ". id: " + items[i].getId() + ". name: " + items[i].getName());
            }
        }
        return true;
    }
}
