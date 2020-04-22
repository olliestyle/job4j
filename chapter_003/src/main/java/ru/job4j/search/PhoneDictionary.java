package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {

//        Predicate<Person> address = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAddress().contains(key);
//            }
//        };
        Predicate<Person> findByAddress = person -> person.getAddress().contains(key);
        Predicate<Person> findByName = person -> person.getName().contains(key);
        Predicate<Person> findByPhone = person -> person.getPhone().contains(key);
        Predicate<Person> findBySurname = person -> person.getSurname().contains(key);
        Predicate<Person> combine = findByAddress.or(findByName.or(findByPhone.or(findBySurname)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
