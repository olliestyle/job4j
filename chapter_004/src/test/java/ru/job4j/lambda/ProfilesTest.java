package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenMapAdresses() {
        Address firstAddress = new Address("SPb", "pr.Lenina", 31, 151);
        Address secondAddress = new Address("Moscow", "pr.Stalina", 33, 321);
        Address thirdAddress = new Address("Sochi", "pr.Alabay", 2, 57);
        Profile firstProfile = new Profile(firstAddress);
        Profile secondProfile = new Profile(secondAddress);
        Profile thirdProfile = new Profile(thirdAddress);
        List<Profile> inputProfileList = Arrays.asList(firstProfile, secondProfile, thirdProfile);
        List<Address> expected = Arrays.asList(firstAddress, secondAddress, thirdAddress);
        List<Address> result = Profiles.collect(inputProfileList);
        assertThat(result, is(expected));
    }
}
