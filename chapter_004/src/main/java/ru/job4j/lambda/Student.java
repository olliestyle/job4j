package ru.job4j.lambda;

import java.util.Objects;

public class Student {
    private int score;

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
        return Objects.hash(score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(score, student.score);
    }

    @Override
    public String toString() {
        return "score = " + score;
    }
}
