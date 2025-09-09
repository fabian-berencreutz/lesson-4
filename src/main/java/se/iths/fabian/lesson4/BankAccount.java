package se.iths.fabian.lesson4;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
    }

    public void getBalance() {
        System.out.println(balance);
    }
}
