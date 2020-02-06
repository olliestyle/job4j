package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean hasDoctorDiplom;
    private String medUniversityGraduation;

    public boolean isHasDoctorDiplom() {
        return this.hasDoctorDiplom;
    }

    public String getMedUniversityGraduation() {
        return this.medUniversityGraduation;
    }
}
