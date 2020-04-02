package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User toFind: users) {
            if (toFind.getUserName().equals(login)) {
                System.out.println("User " + login + " was found");
                return toFind;
            }
        }
        throw new UserNotFoundException("User with login \"" + login + " \" was not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUserName().length() >= 3 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("User \"" + user.getUserName() + "\" is not valid");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
