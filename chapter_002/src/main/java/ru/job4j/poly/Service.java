package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Murat Babiolatov");
    }

    public static void main(String[] args) {
        Store store = new DbStore();
        //DbStore store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
