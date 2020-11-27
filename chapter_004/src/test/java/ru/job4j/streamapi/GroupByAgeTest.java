package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GroupByAgeTest {

    @Test
    public void testGroupByStream() {
        Client client1 = new Client(20, "Petr");
        Client client2 = new Client(22, "Murat");
        Client client3 = new Client(20, "Lesha");
        Client client4 = new Client(22, "Pavel");
        Client client5 = new Client(20, "Stig");
        Client client6 = new Client(21, "Gerv");
        Client client7 = new Client(22, "Bred");
        Client client8 = new Client(23, "Tort");
        Client client9 = new Client(20, "Sven");
        Client client10 = new Client(22, "Culk");
        List<Client> clients = List.of(client1, client2, client3, client4, client5, client6, client7, client8, client9, client10);
        Map<Integer, List<Client>> expected = Map.of(20, List.of(client1, client3, client5, client9),
                                                     21, List.of(client6),
                                                     22, List.of(client2, client4, client7, client10),
                                                     23, List.of(client8));
        assertEquals(expected, GroupByAge.groupByAgeStream(clients));
    }

    @Test
    public void testGroupByFor() {
        Client client1 = new Client(20, "Petr");
        Client client2 = new Client(22, "Murat");
        Client client3 = new Client(20, "Lesha");
        Client client4 = new Client(22, "Pavel");
        Client client5 = new Client(20, "Stig");
        Client client6 = new Client(21, "Gerv");
        Client client7 = new Client(22, "Bred");
        Client client8 = new Client(23, "Tort");
        Client client9 = new Client(20, "Sven");
        Client client10 = new Client(22, "Culk");
        List<Client> clients = List.of(client1, client2, client3, client4, client5, client6, client7, client8, client9, client10);
        Map<Integer, List<Client>> expected = Map.of(20, List.of(client1, client3, client5, client9),
                21, List.of(client6),
                22, List.of(client2, client4, client7, client10),
                23, List.of(client8));
        assertEquals(expected, GroupByAge.groupByAgeFor(clients));
    }
}