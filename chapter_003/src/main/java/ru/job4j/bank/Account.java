package ru.job4j.bank;

import java.util.Objects;

public class Account {

    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return this.requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        // приватность поля обеспечивается по отношению класса вообщем, а не конкретно к экземпляру класса
        // именно поэтому мы можем обратиться к приватному полю другого объекта, но одного и того же класса
        return Objects.equals(requisite, account.requisite);
    }
}
