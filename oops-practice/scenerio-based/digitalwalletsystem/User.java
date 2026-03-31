package com.oops.digitalwalletsystem;

public class User {

    private int userId;
    private String userName;
    private Wallet wallet;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.wallet = new Wallet();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Wallet getWallet() {
        return wallet;
    }
}