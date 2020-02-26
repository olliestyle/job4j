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

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for(String abuse: abuses) {
            if(value == abuse) {
                throw new ElementAbuseException("Element is in abuseList!");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] names = {"vanya", "kamol", "oleg", "egor"};
        String[] abuses = {"vanya", "kamol"};
        try{
            System.out.println("Index of element is " + FindEl.indexOf(names, "oleg"));
            System.out.println("Try sent method -> " + FindEl.sent("gol", abuses));
        } catch (ElementAbuseException e) {
            e.printStackTrace();
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
