package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== List of all Items ===");
                Item[] items = tracker.findAll();
                for(int i = 0; i < items.length; i++) {
                    System.out.println(i+1 + ". id: " + items[i].getId() + ". name: " + items[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                System.out.println("Enter id of item to edit");
                String id = scanner.nextLine();
                System.out.print("Set new name: ");
                String name = scanner.nextLine();
                boolean canBeReplaced = tracker.replace(id, new Item(name));
                if (canBeReplaced){
                    System.out.println("Item was edited");
                } else {
                    System.out.println("There is no item with this id " + id);
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.println("Enter id of item to delete");
                String id = scanner.nextLine();
                boolean canBeDeleted = tracker.delete(id);
                if (canBeDeleted){
                    System.out.println("Item was deleted");
                } else {
                    System.out.println("There is no item with this id " + id);
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID===");
                System.out.println("Enter id of item to find");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item == null){
                    System.out.println("There is no item with this id " + id);
                } else {
                    System.out.println("Item was found: id " + item.getId() + ", name " + item.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by Name===");
                System.out.println("Enter name of item to find");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length == 0){
                    System.out.println("There is no items with this name: " + name);
                } else {
                    System.out.println("List of items that was found: ");
                    for(int i = 0; i < items.length; i++) {
                        System.out.println(i+1 + ". id: " + items[i].getId() + ". name: " + items[i].getName());
                    }
                }
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
