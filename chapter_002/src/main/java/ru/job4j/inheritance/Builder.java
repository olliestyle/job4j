package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean hasBuilderAccreditation;
    private OperationResult operationResult;

    public OperationResult build(House house) {
        return operationResult;
    }

    public OperationResult destroy(House house) {
        return operationResult;
    }

    public boolean isHasBuilderAccreditation() {
        return hasBuilderAccreditation;
    }

    public OperationResult getOperationResult() {
        return operationResult;
    }
}
