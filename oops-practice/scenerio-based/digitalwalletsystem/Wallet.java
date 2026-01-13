package com.oops.digitalwalletsystem;

import java.util.ArrayList;

public class Wallet {

    private double balance;
    private ArrayList<Transaction> transactions;

    public Wallet() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount, "Money added"));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount, "Money withdrawn"));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {

        System.out.println("\nTransaction History:");
		for (int i = 0; i < transactions.size(); i++) {
			Transaction transaction = transactions.get(i);
			System.out.println(transaction.getType() + " " + transaction.getAmount() + " " +
			transaction.getDescription());
		}
    }
}
