package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery energizer = new Battery(57);
        Battery duracell = new Battery(40);
        System.out.println("energizer load is " + energizer.load + ". duracell load is " + duracell.load);
        energizer.exchange(duracell);
        System.out.println("energizer load is " + energizer.load + ". duracell load is " + duracell.load);
    }
}
