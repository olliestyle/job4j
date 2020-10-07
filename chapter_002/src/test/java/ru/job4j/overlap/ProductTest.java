package ru.job4j.overlap;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void simpleTest() {
        PriceUpdater priceUpdater = new PriceUpdater();
        Price firstPrice = new Price("122856", 1, 1,
                LocalDateTime.of(2013, Month.JANUARY, 1, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 23, 59, 59),
                11000);
        Price secondPrice = new Price("122856", 2, 1,
                LocalDateTime.of(2013, Month.JANUARY, 10, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 20, 23, 59, 59),
                99000);
        Price thirdPrice = new Price("6654", 1, 2,
                LocalDateTime.of(2013, Month.JANUARY, 1, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 00, 00, 00),
                5000);
        List<Price> currentPrices = new ArrayList<>();
        currentPrices.add(firstPrice);
        currentPrices.add(secondPrice);
        currentPrices.add(thirdPrice);

        Price firstNewPrice = new Price("122856", 1, 1,
                LocalDateTime.of(2013, Month.JANUARY, 20, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000);
        Price secondNewPrice = new Price("122856", 2, 1,
                LocalDateTime.of(2013, Month.JANUARY, 15, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 25, 23, 59, 59),
                92000);
        Price thirdNewPrice = new Price("6654", 1, 2,
                LocalDateTime.of(2013, Month.JANUARY, 12, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 13, 00, 00, 00),
                4000);

        List<Price> newPrices = new ArrayList<>();
        newPrices.add(firstNewPrice);
        newPrices.add(secondNewPrice);
        newPrices.add(thirdNewPrice);

        Price firstExpectedPrice = new Price("122856", 1, 1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000);
        Price secondExpectedPrice = new Price("122856", 2, 1,
                LocalDateTime.of(2013, Month.JANUARY, 10, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 15, 00, 00, 00),
                99000);
        Price thirdExpectedPrice = new Price("122856", 2, 1,
                LocalDateTime.of(2013, Month.JANUARY, 15, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 25, 23, 59, 59),
                92000);
        Price forthExpectedPrice = new Price("6654", 1, 2,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 12, 00, 00, 00),
                5000);
        Price fifthExpectedPrice = new Price("6654", 1, 2,
                LocalDateTime.of(2013, Month.JANUARY, 12, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 13, 00, 00, 00),
                4000);
        Price sixthExpectedPrice = new Price("6654", 1, 2,
                LocalDateTime.of(2013, Month.JANUARY, 13, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 00, 00, 00),
                5000);

        List<Price> expectedPrices = new ArrayList<>();
        expectedPrices.add(firstExpectedPrice);
        expectedPrices.add(secondExpectedPrice);
        expectedPrices.add(thirdExpectedPrice);
        expectedPrices.add(forthExpectedPrice);
        expectedPrices.add(fifthExpectedPrice);
        expectedPrices.add(sixthExpectedPrice);

        List<Price> updatedPrices = priceUpdater.merge(currentPrices, newPrices);
        boolean isEquals = Objects.equals(updatedPrices, expectedPrices);
        assertThat(isEquals, is(true));
    }
}
