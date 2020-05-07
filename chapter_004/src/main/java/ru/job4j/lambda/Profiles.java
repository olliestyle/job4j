package ru.job4j.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
    }

    public static List<Address> sortAndDistinct(List<Profile> profiles) {
        return collect(profiles).stream().sorted(Comparator.comparing(Address::getCity)).distinct().collect(Collectors.toList());

    }
}
