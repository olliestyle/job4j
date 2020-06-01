package ru.job4j.lambda;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return score == student.score && surname.equals(student.surname);
    }

    @Override
    public String toString() {
        return "score = " + score;
    }
}
