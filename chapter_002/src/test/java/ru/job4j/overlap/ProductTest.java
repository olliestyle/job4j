package ru.job4j.overlap;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void simpleTest() {
        ProductMonitor productMonitor = new ProductMonitor();
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
                11000), null};
        Price[] updated = productMonitor.merge(pricesBeforeUpdate, incomingPrice);
        //assertThat(pricesBeforeUpdate[0].getEnd(), is(expected[0].getEnd())); // проверяем поменялась ли дата
        boolean isEquals = Arrays.equals(updated, expected);
        assertThat(isEquals, is(true));
    }

    @Test
    public void simpleTest2() {
        ProductMonitor productMonitor = new ProductMonitor();
        Price[] pricesBeforeUpdate = {new Price(
                "122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.JANUARY, 31, 23, 59, 59),
                11000),
                new Price(
                        "133333",
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
        Price[] expected = { new Price("122856",
                1,
                1,
                LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                LocalDateTime.of(2013, Month.FEBRUARY, 20, 23, 59, 59),
                11000),
                new Price(
                        "133333",
                        1,
                        1,
                        LocalDateTime.of(2013, Month.JANUARY, 01, 00, 00, 00),
                        LocalDateTime.of(2013, Month.JANUARY, 31, 23, 59, 59),
                        11000), null};
        Price[] updated = productMonitor.merge(pricesBeforeUpdate, incomingPrice);
        boolean isEquals = Arrays.equals(updated, expected);
        assertThat(isEquals, is(true));
    }
}
