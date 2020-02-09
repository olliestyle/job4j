package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Murat");
        student.setSurname("Baibolatov");
        student.setPatronymic("Ruslanovich");
        student.setGroup("1942");
        student.setEntered(new Date());

        System.out.println("Student: " + student.getSurname()
                + " " + student.getName()
                + " " + student.getPatronymic()
                + " assigned to the group "
                + student.getGroup()
                + " at " + student.getEntered()
        );
    }
}
