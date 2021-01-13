package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;

public class StartUI {
    public void init(Input input, Store store, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, store);
        }
    }

        private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        int index = 0;
        for (UserAction action: actions) {
            System.out.println(index + " " + action.name());
            index++;
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
//        MemTracker memTracker = new MemTracker();
        try (Store tracker = new SqlTracker()) {
            tracker.init();
            List<UserAction> actions = new ArrayList<>();
            actions.add(new CreateAction());
            actions.add(new ShowAllAction());
            actions.add(new EditAction());
            actions.add(new DeleteAction());
            actions.add(new FindByIDAction());
            actions.add(new FindByNameAction());
            actions.add(new ExitAction());
            new StartUI().init(validate, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
