package ru.job4j.lambda;

public interface PersonFactory<P> {
    public P create(String firstName, String lastName);
}
