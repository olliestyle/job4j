package ru.job4j.oop;

public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman; //down Cast
        Object object = freshman; //down Cast
        Freshman freshman1 = (Freshman) object; //up Cast
    }
}
