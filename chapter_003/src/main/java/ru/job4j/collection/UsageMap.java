package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> simpleMap = new HashMap<>();
        simpleMap.put("olliestyle1989@gmail.com", "Baibolatov Murat");
        simpleMap.put("egor777@gmail.com", "Ivanov Egor");
        simpleMap.put("oleg666@gmail.com", "Genkin Oleg");

        System.out.println("Через метод keySet()");
        for (String key: simpleMap.keySet()) {
            System.out.println("key is - " + key + ", value is - " + simpleMap.get(key));
        }

        System.out.println("Через метод entrySet()");
        for (Map.Entry<String, String> map: simpleMap.entrySet()) {
            System.out.println("key is - " + map.getKey() + ", value is - " + map.getValue());
        }
    }
}
