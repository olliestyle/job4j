package ru.job4j.tracker;

public class EditAction implements UserAction {

    private final Output output;

    public EditAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "==== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Store store) {
        String id = input.askStr("Enter id of item to edit");
        String name = input.askStr("Set new name: ");
        boolean canBeReplaced = store.replace(id, new Item(name));
        if (canBeReplaced) {
            System.out.println("Item was edited");
        } else {
            System.out.println("There is no item with this id " + id);
        }
        return true;
    }
}
