package main.java.com.jeremie.id;

public class BankAccount {

    public int balance;


    public BankAccount() {

    }

    public BankAccount(int i) {
        balance = i;
    }


    public void deposit(int i) {
        if(i < 0)
            throw new NumberFormatException("Negative Values not allowed!");
        balance += i;
    }

    public void withdraw(int i) {
        balance -= Math.min(i, 100);
    }

    public int getBalance() {
        return balance;
    }
}
