package ru.job4j.overlap;

public interface PriceUpdate {
    void merge(Price[] currentPrices, Price[] newPrices);
}
