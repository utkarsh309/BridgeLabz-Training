package com.oops.digitalwalletsystem;

public class DigitalWalletApp {

    public static void main(String[] args) {

        User user1 = new User(1, "Utkarsh");
        User user2 = new User(2, "Aman");

        user1.getWallet().addMoney(500);

        try {
            user1.getWallet().withdrawMoney(100);

            TransferService transferService = new WalletTransferService();
            transferService.transfer(user1.getWallet(), user2.getWallet(), 200);

        } catch (InsufficientBalanceException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        System.out.println(user1.getUserName() + " Balance: " + user1.getWallet().getBalance());
        user1.getWallet().showTransactions();

        System.out.println(user2.getUserName() + " Balance: " + user2.getWallet().getBalance());
        user2.getWallet().showTransactions();
    }
}
