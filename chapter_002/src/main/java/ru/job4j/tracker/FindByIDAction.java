package ru.job4j.tracker;

public class FindByIDAction implements UserAction {
    @Override
    public String name() {
        return "==== Find Item by ID ====";
    }

    @Override
    public boolean execute(Input input, Store store) {
        String id = input.askStr("Enter id of item to find");
        Item item = store.findById(id);
        if (item == null) {
            System.out.println("There is no item with this id " + id);
        } else {
            System.out.println("Item was found: id " + item.getId() + ", name " + item.getName());
        }
        return true;
    }
}
