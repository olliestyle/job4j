package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "==== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Store store) {
        String id = input.askStr("Enter id of item to delete");
        boolean canBeDeleted = store.delete(id);
        if (canBeDeleted) {
            System.out.println("Item was deleted");
        } else {
            System.out.println("There is no item with this id " + id);
        }
        return true;
    }
}
