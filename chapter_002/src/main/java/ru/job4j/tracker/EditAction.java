package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "==== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id of item to edit");
        String name = input.askStr("Set new name: ");
        boolean canBeReplaced = tracker.replace(id, new Item(name));
        if (canBeReplaced) {
            System.out.println("Item was edited");
        } else {
            System.out.println("There is no item with this id " + id);
        }
        return true;
    }
}
