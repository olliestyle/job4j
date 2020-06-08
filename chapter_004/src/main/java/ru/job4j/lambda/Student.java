package ru.job4j.lambda;

import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student>{

    private int score;
    private String name;
    private String surname;
    private Set<String> units;

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUnits(Set<String> units) {
        this.units = units;
    }

    public Set<String> getUnits() {
        return units;
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

    @Override
    public int compareTo(Student o) {
        return o.getScore() > getScore() ? 1 : o.getScore() == getScore() ? 0 : -1 ;
    }
}
