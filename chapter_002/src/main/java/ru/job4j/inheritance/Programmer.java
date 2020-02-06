package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean hasCompletedCourses;
    private OperationResult operationResult;

    public OperationResult writeCode(IDE ide) {
        return operationResult;
    }

    public OperationResult buildProject(IDE ide) {
        return operationResult;
    }

    public boolean isHasCompletedCourses() {
        return hasCompletedCourses;
    }

    public OperationResult getOperationResult() {
        return operationResult;
    }
}
