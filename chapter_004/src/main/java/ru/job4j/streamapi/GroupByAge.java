package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAge {

    public static Map<Integer, List<Client>> groupByAgeStream(List<Client> clients) {
        return clients.stream().collect(Collectors.groupingBy(client -> client.getAge()));
    }

    public static Map<Integer, List<Client>> groupByAgeFor(List<Client> clients) {
        Map<Integer, List<Client>> result = new HashMap<>();
        for (Client client: clients) {
            if (result.containsKey(client.getAge())) {
                result.get(client.getAge()).add(client);
            } else {
                List<Client> toAdd = new ArrayList<>();
                toAdd.add(client);
                result.put(client.getAge(), toAdd);
            }
        }
        return result;
    }

    public static void main(String[] args) {
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
        Map<Integer, List<Client>> map = groupByAgeStream(clients);
        for (Map.Entry<Integer, List<Client>> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println();
        System.out.println();

        Map<Integer, List<Client>> map1 = groupByAgeFor(clients);
        for (Map.Entry<Integer, List<Client>> entry: map1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

class Client {
    int age;
    String name;

    Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
