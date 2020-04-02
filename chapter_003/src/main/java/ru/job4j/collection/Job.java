package ru.job4j.collection;

import java.util.Objects;

public class Job implements Comparable<Job>{

    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return priority == job.priority && name.equals(job.name);
    }
}
