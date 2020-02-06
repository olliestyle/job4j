package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean hasDentistAccreditation;
    private OperationResult operationResult;

    public OperationResult delete(Tooth tooth) {
        return operationResult;
    }

    public OperationResult heal(Tooth tooth) {
        return operationResult;
    }

    public boolean isHasDentistAccreditation() {
        return hasDentistAccreditation;
    }

    public OperationResult getOperationResult() {
        return operationResult;
    }
}
