//day2 exercise 2&3:
package com.example.week_1.day_2;

public class BankAccount {
    private double balance;
    private static int accountCount = 0;
    //Constructor for an account with an initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        balance = initialBalance;
        accountCount++;
    }
    // Constructor for an account starting with zero balance
    public BankAccount() {
        this(0);
    }
    //Deposit money function from ex2:
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance = balance + amount;
    }
    //Return the current balance
    public double getBalance() {
        return balance;
    }
    //Withdraw money function from ex2
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance = balance - amount;
    }
    // Return the number of accounts created from ex3
    public static int getAccountCount() {
        return accountCount;
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0);
        BankAccount account2 = new BankAccount(1000);
        BankAccount account3 = new BankAccount();

        account1.deposit(5000);
        System.out.println("Account 1 after deposit: " + account1.getBalance());
        account1.withdraw(2000);
        System.out.println("Account 1 after withdrawal: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Account 3 balance: " + account3.getBalance());
        System.out.println("Number of bank accounts created: " + BankAccount.getAccountCount());
    }
}