package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean hasEngineerDiplom;
    private String techUniversityGraduation;

    public boolean isHasEngineerDiplom() {
        return this.hasEngineerDiplom;
    }

    public String getTechUniversityGraduation() {
        return this.techUniversityGraduation;
    }
}
