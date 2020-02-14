package ru.job4j.poly;

public interface Transport {

    void drive();
    void addPassangers(int passengers);
    float fillFuel(float fuelCount, float priceForLiter);
}
