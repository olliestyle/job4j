package ru.job4j.overlap;

public interface PriceUpdate {
    Price[] merge(Price[] currentPrices, Price[] newPrices);
}
