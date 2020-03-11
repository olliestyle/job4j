package ru.job4j.overlap;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void simpleTest() {
        ProductMonitor product = new ProductMonitor();
        Price[] pricesBeforeUpdate = {new Price(
                "122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 23, 59, 59),
                11000)
        };

        Price[] incomingPrice = {new Price(
                "122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 20, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000)
        };
        Price[] expected = {new Price("122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000)};
        Price[] result = product.merge(pricesBeforeUpdate, incomingPrice);
        assertThat(result, is(expected));
    }

    @Test
    public void when() {
        ProductMonitor product = new ProductMonitor();
        Price[] pricesBeforeUpdate = {new Price(
                "122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 23, 59, 59),
                11000),
                new Price(
                "122856",
                2,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 10, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 20, 23, 59, 59),
                99000),
                new Price(
                "6654",
                1,
                2,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 00, 00, 00),
                5000
                )};

        Price[] incomingPrice = {new Price(
                "122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 20, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000),
                new Price(
                        "122856",
                        2,
                        1,
                        LocalDateTime.of(2013, Month.JANUARY, 15, 00, 00, 00),
                        LocalDateTime.of(2013, Month.JANUARY, 25, 23, 59, 59),
                        92000),
                new Price(
                        "6654",
                        1,
                        2,
                        LocalDateTime.of(2013, Month.JANUARY, 12, 00, 00, 00),
                        LocalDateTime.of(2013, Month.JANUARY, 13, 00, 00, 00),
                        4000
                )};
    }
}
