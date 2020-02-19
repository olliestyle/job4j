package ru.job4j.tracker;



public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByID(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== List of all Items ===");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ". id: " + items[i].getId() + ". name: " + items[i].getName());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String id = input.askStr("Enter id of item to edit");
        String name = input.askStr("Set new name: ");
        boolean canBeReplaced = tracker.replace(id, new Item(name));
        if (canBeReplaced) {
            System.out.println("Item was edited");
        } else {
            System.out.println("There is no item with this id " + id);
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String id = input.askStr("Enter id of item to delete");
        boolean canBeDeleted = tracker.delete(id);
        if (canBeDeleted) {
            System.out.println("Item was deleted");
        } else {
            System.out.println("There is no item with this id " + id);
        }
    }

    public static void findByID(Input input, Tracker tracker) {
        System.out.println("=== Find Item by ID===");
        String id = input.askStr("Enter id of item to find");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("There is no item with this id " + id);
        } else {
            System.out.println("Item was found: id " + item.getId() + ", name " + item.getName());
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Name===");
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
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
