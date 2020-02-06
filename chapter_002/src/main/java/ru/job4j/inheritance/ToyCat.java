package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWashedByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.canPurr();

        ToyCat toyCat = new ToyCat();
        toyCat.canPurr();
        toyCat.canBeWashedByWashMachine();
    }
}
