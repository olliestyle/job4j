package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addThreeCitizens() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Nikolai Ivanov");
        Citizen citizen3 = new Citizen("34456", "Ivan Petrov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen2);
        office.add(citizen3);
        assertThat("Petr Arsentev", is(office.get("2f44a").getUsername()));
    }
}
