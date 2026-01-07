package onlineBankingSystem;

import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InsufficientBalanceException extends Exception {

    // Constructor
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Abstract Class
abstract class Account {

    // Attributes
    protected int accountNumber;
    protected String name;
    protected double balance;
    protected List<String> transactionHistory = new ArrayList<>();

    // Constructor
    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        }
    }

    // Withdraw
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        transactionHistory.add("Withdrawn: " + amount);
    }

    // Balance Check
    public double getBalance() {
        return balance;
    }

    // Transaction History
    public void showTransactions() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Polymorphism
    public abstract double calculateInterest();
}

// Inheritance
class SavingsAccount extends Account {

    // Constant
    private static final double INTEREST_RATE = 0.04;

    // Constructor
    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Polymorphism
    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// Inheritance
class CurrentAccount extends Account {

    // Constructor
    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Polymorphism
    @Override
    public double calculateInterest() {
        return 0;
    }
}

// Interface
interface BankService {

    void createAccount(Account account);

    void transferFunds(Account from, Account to, double amount)
            throws InsufficientBalanceException;
}

// Implementation Class
class BankServiceImpl implements BankService {

    // Attributes
    private List<Account> accounts = new ArrayList<>();

    // Create Account
    @Override
    public void createAccount(Account account) {
        accounts.add(account);
    }

    // Fund Transfer
    @Override
    public void transferFunds(Account from, Account to,double amount) throws InsufficientBalanceException {

        from.withdraw(amount);
        to.deposit(amount);

        from.transactionHistory.add("Transferred " + amount + " to Account " + to.accountNumber);
        to.transactionHistory.add("Received " + amount + " from Account " + from.accountNumber);
    }
}

// Multithreading
class TransactionThread extends Thread {

    // Attributes
    private BankService bankService;
    private Account from;
    private Account to;
    private double amount;

    // Constructor
    TransactionThread(BankService bankService,Account from,Account to,double amount) {
        this.bankService = bankService;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    // Thread Execution
    @Override
    public void run() {
        try {
            bankService.transferFunds(from, to, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Main Class
public class OnlineBankingSystem {

    public static void main(String[] args) {

        // Service Object
        BankService bankService = new BankServiceImpl();

        // Account Objects
        Account acc1 = new SavingsAccount(101, "Utkarsh", 5000);
        Account acc2 = new CurrentAccount(102, "Amit", 3000);

        // Add Accounts
        bankService.createAccount(acc1);
        bankService.createAccount(acc2);

        // Concurrent Transactions
        Thread t1 = new TransactionThread(bankService, acc1, acc2, 1000);
        Thread t2 = new TransactionThread(bankService, acc1, acc2, 700);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }

        // Output
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 1 Interest: " + acc1.calculateInterest());
        System.out.println("Account 2 Balance: " + acc2.getBalance());

        System.out.println("Transaction History:");
        acc1.showTransactions();
    }
}
