package ru.job4j.collection;

import java.util.Objects;

public class Team {

    private String city;
    private String department;

    public Team(String city, String department) {
        this.city = city;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Team team = (Team) obj;
        return team.city == city && team.department == department;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (city != null) {
            result = 31 * result + city.hashCode();
        }
        if (department != null) {
            result = 31 * result + city.hashCode();
        }
        return result;
    }
}
