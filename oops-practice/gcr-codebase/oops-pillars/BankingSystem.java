package oopsPillars;

import java.util.ArrayList;
import java.util.List;

// Abstract class
abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract double calculateInterest();

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface
interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for Savings Account: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for Current Account: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Utkarsh", 8000));
        accounts.add(new CurrentAccount("CA202", "Aditya", 15000));

        for (BankAccount account : accounts) {

            account.displayAccount();
            System.out.println("Interest: " + account.calculateInterest());

            Loanable loanAccount = (Loanable) account;
            loanAccount.applyForLoan(50000);
            System.out.println("Loan Eligible: " + loanAccount.calculateLoanEligibility());

            System.out.println();
        }
    }
}

