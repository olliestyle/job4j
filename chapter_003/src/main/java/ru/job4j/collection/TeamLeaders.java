package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class TeamLeaders {
    public static void main(String[] args) {
        HashMap<Team, String> leaders = new HashMap<>();
        leaders.put(new Team("New york", "development"), "Anne");
        leaders.put(new Team("Boston", "development"), "Brian");
        leaders.put(new Team("Boston", "marketing"), "Charlie");

        // Если бы в Team был определён только equals(), то следующий код привел бы к выводу в консоль "null",
        // т.к. hashCode() был бы разный у объектов с ключом  New york, development.
        // А если мы переопределим еще и hashCode() то он вычислится и выдаст результат в консоль "Anne", т.к.
        // хэшкод будет одинаковый у двух "разных по ссылке" объектов
        Team myTeam = new Team("New york", "development");
        String myTeamLeader = leaders.get(myTeam);
        System.out.println(myTeamLeader);
    }
}
