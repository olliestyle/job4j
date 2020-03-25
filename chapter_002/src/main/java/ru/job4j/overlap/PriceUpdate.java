package ru.job4j.overlap;

import java.util.List;

public interface PriceUpdate {
    List<Price> merge(List<Price> currentPrices, List<Price> newPrices) throws CloneNotSupportedException;
}
