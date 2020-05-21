package ru.job4j.lambda;

public class Test {

    private int call;

    public Test(int call) {
        this.call = call;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Test test = (Test) obj;
        return test.call == call;
    }

    @Override
    public String toString() {
        return "this is " + call;
    }
}
