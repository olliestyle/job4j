package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book idiot = new Book("Idiot", 1000);
        Book cleanCode = new Book("Clean code", 500);
        Book divineComedy = new Book("Divine comedy", 1500);
        Book warAndPeace = new Book("Voina i mir", 2000);

        Book[] myBooks = new Book[4];

        myBooks[0] = idiot;
        myBooks[1] = cleanCode;
        myBooks[2] = divineComedy;
        myBooks[3] = warAndPeace;

        for (int i = 0; i < myBooks.length; i++) {
            System.out.println("Book - " + myBooks[i].getName() + ". Kol-vo stranic - " + myBooks[i].getNumberOfPages());
        }

        Book temp;
        temp = myBooks[0];
        myBooks[0] = myBooks[3];
        myBooks[3] = temp;
        System.out.println("Adter swap [0] and [3]");

        for (int i = 0; i < myBooks.length; i++) {
            System.out.println("Book - " + myBooks[i].getName() + ". Kol-vo stranic - " + myBooks[i].getNumberOfPages());
        }

        System.out.println("Only Clean code");

        for (int i = 0; i < myBooks.length; i++) {
            if (myBooks[i].getName().equals("Clean code")) {
                System.out.println("Book - " + myBooks[i].getName() + ". Kol-vo stranic - " + myBooks[i].getNumberOfPages());
            }
        }
    }
}
