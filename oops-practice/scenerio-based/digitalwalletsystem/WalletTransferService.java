package com.oops.digitalwalletsystem;

public class WalletTransferService implements TransferService {

    @Override
    public void transfer(Wallet fromWallet, Wallet toWallet, double amount)
            throws InsufficientBalanceException {

        if (amount > fromWallet.getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance for transfer.");
        }

        fromWallet.withdrawMoney(amount);
        toWallet.addMoney(amount);

        fromWallet.addTransaction(new Transaction("TRANSFER", amount, "Sent to another wallet"));
        toWallet.addTransaction(new Transaction("TRANSFER", amount, "Received from another wallet"));
    }
}
