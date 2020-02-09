package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rand = new Random();
        return String.valueOf(rand.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for(int index = 0; index < this.items.length; index++) {
            if(this.items[index] != null){
                itemsWithoutNull[size] = this.items[index];
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsFinded = new Item[items.length];
        int size = 0;
        for(int index = 0; index < this.items.length; index++) {
            if(this.items[index] != null && this.items[index].getName().equals(key)){
                itemsFinded[size] = this.items[index];
                size++;
            }
        }
        return Arrays.copyOf(itemsFinded, size);
    }

    public Item findById(String id) {
        return this.items[indexOf(id)];
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        Item itemToReplace = findById(id);
        itemToReplace.setName(item.getName());
        item.setId(itemToReplace.getId());
        return true;
    }
}
