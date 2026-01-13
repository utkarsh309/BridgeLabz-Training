package com.oops.digitalwalletsystem;

public interface TransferService {

    void transfer(Wallet fromWallet, Wallet toWallet, double amount)
            throws InsufficientBalanceException;
}