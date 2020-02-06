package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean hasSurgeonAccreditation;
    private OperationResult operationResult;

    public OperationResult delete(Appendix appendix) {
        return operationResult;
    }

    public boolean isHasSurgeonAccreditation() {
        return hasSurgeonAccreditation;
    }

    public OperationResult getOperationResult() {
        return operationResult;
    }
}
