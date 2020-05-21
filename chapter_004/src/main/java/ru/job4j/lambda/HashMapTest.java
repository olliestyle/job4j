package ru.job4j.lambda;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) throws Exception {
        Map<Test, Integer> testIntegerMap = new HashMap<>();
        Test test1 = new Test(1);
        Test test2 = new Test(2);
        Test test3 = new Test(3);
        Test test4 = new Test(4);
        Test test5 = new Test(5);
        Test test6 = new Test(6);
        Test test7 = new Test(7);
        Test test8 = new Test(8);
        Test test9 = new Test(9);
        Test test10 = new Test(10);
        Test test11 = new Test(11);
        Test test12 = new Test(12);
        Test test13 = new Test(13);
        Test test14 = new Test(14);
        Test test15 = new Test(15);
        Test test16 = new Test(16);
        Test test17 = new Test(17);
        Test test18 = new Test(18);
        testIntegerMap.put(test1, 1);
        testIntegerMap.put(test2, 2);
        testIntegerMap.put(test3, 3);
        testIntegerMap.put(test4, 4);
        testIntegerMap.put(test5, 5);
        testIntegerMap.put(test6, 6);
        testIntegerMap.put(test7, 7);
        testIntegerMap.put(test8, 8);
        testIntegerMap.put(test9, 9);
        testIntegerMap.put(test10, 10);
//        testIntegerMap.put(test11, 11);
//        testIntegerMap.remove(test1);
//        testIntegerMap.remove(test2);
//        testIntegerMap.remove(test3);
//        testIntegerMap.remove(test4);
//        testIntegerMap.remove(test5);
//        testIntegerMap.remove(test6);
//        testIntegerMap.remove(test7);
//        testIntegerMap.remove(test8);
//        testIntegerMap.remove(test9);
//        testIntegerMap.put(test12, 12);
//        testIntegerMap.put(test13, 13);
//        testIntegerMap.put(test14, 14);
//        testIntegerMap.put(test15, 15);
//        testIntegerMap.put(test16, 16);
//        testIntegerMap.put(test17, 17);
//        testIntegerMap.put(test18, 18);

        Class clazz = testIntegerMap.getClass();
        Field table = clazz.getDeclaredField("table");
        table.setAccessible(true);
        Map.Entry<Integer, String>[] realTable = (Map.Entry<Integer, String>[]) table.get(testIntegerMap);

        for (int i = 0; i < realTable.length; i++) {
            System.out.println(String.format("Bucket : %d, Entry: %s", i, bucketToString(realTable[i])));
        }
    }

    private static String bucketToString(Map.Entry<Integer, String> entry) throws Exception {
        if (entry == null) return null;
        StringBuilder sb = new StringBuilder();

        //Access to the "next" filed of HashMap$Node
        Class clazz = entry.getClass();
        Field next = clazz.getDeclaredField("next");
        next.setAccessible(true);

        //going through the bucket
        while (entry != null) {
            sb.append(entry);
            entry = (Map.Entry<Integer, String>) next.get(entry);
            if (null != entry) sb.append(" -> ");
        }
        return sb.toString();
    }
}
