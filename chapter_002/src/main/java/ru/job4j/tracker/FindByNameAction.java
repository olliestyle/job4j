package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Item by Name ====";
    }

    @Override
    public boolean execute(Input input, Store store) {
        String name = input.askStr("Enter name of item to find");
        List<Item> items = store.findByName(name);
        if (items.size() == 0) {
            System.out.println("There is no items with this name: " + name);
        } else {
            System.out.println("List of items that was found: ");
            for (Item foundItem: items) {
                System.out.println(foundItem.getId() + " " + foundItem.getName());
            }
        }
        return true;
    }
}
