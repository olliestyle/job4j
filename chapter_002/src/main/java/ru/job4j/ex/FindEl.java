package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;
        for(String toFind: value){
            rsl += 1;
            if (toFind.equals(key)){
                return rsl;
            }
        }
        throw new ElementNotFoundException("Element not found");
    }

    public static void main(String[] args) {
        String[] names = {"vanya", "kamol", "oleg", "egor"};
        try{
            System.out.println("Index of element is " + FindEl.indexOf(names, "error"));
        } catch (ElementNotFoundException e){
            e.printStackTrace();
        }
    }
}
