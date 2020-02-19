package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers = 0;
    private float fuelCount = 10;

    @Override
    public void drive() {
        System.out.println("I'm on my way");
        fuelCount--;
    }

    @Override
    public void addPassangers(int passengers) {
        this.passengers += passengers;
    }

    @Override
    public float fillFuel(float fuelCount, float priceForLiter) {
        this.fuelCount += fuelCount;
        return fuelCount * priceForLiter;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.addPassangers(2);
        bus.drive();
        bus.addPassangers(3);
        bus.drive();
        bus.addPassangers(5);
        System.out.println("Количество пассажиров до заправки: " + bus.getPassengers()
                + ". Количество топлива до заправки: " + bus.getFuelCount());
        System.out.println("Заправляемся на 30 литров по цене 47.87 руб/литр. Итого: "
                + bus.fillFuel(30, 47.87f) + " руб.");
        bus.drive();
        bus.addPassangers(30);
        System.out.println("Количество пассажиров после заправки: " + bus.getPassengers()
                + ". Количество топлива после заправки: " + bus.getFuelCount());
    }

    public int getPassengers() {
        return passengers;
    }

    public float getFuelCount() {
        return fuelCount;
    }
}
