package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenUserNull() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertNull(bank.findByPassport("34"));
    }

    @Test
    public void addAccount() throws UserNotFoundException, AccountNotFoundException {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() throws UserNotFoundException, AccountNotFoundException {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
    }

    @Test(expected = AccountNotFoundException.class)
    public void transferMoneyWithANFExcpetion() throws UserNotFoundException, AccountNotFoundException {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "554", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
    }

    @Test
    public void transferMoneyWhenNotEnoughToTransfer() throws UserNotFoundException, AccountNotFoundException {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean rsl = bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 200D);
        assertThat(rsl, is(false));
    }
}
