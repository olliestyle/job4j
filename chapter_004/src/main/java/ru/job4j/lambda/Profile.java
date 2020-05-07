package ru.job4j.lambda;

import java.util.Objects;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Profile profile = (Profile) obj;
        return Objects.equals(address, profile.address);
    }

    @Override
    public String toString() {
        return address.getCity() + " " + address.getStreet() + " " + address.getHome() + " " + address.getApartment();
    }
}

