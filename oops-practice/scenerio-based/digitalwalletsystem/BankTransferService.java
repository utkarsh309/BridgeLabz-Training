package com.oops.digitalwalletsystem;

public class BankTransferService implements TransferService {

    @Override
    public void transfer(Wallet fromWallet, Wallet toWallet, double amount)
            throws InsufficientBalanceException {

        if (amount > fromWallet.getBalance()) {
            throw new InsufficientBalanceException("Bank transfer failed due to low balance.");
        }

        
        double fee = 5;

        if (amount + fee > fromWallet.getBalance()) {
            throw new InsufficientBalanceException("Not enough balance for bank fee.");
        }

        fromWallet.withdrawMoney(amount + fee);
        toWallet.addMoney(amount);

        fromWallet.addTransaction(new Transaction("BANK TRANSFER", amount, "Sent via bank"));
        toWallet.addTransaction(new Transaction("BANK TRANSFER", amount, "Received via bank"));
    }
}