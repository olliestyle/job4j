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

class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return getCity() + " " + getApartment() + " " + getHome() + " " + getStreet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;
        return city.equals(address.city) && street.equals(address.street)
                && home == address.home && apartment == address.apartment;
    }
}