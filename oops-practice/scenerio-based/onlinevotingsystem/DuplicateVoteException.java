package com.oops.onlinevotingsystem;

public class DuplicateVoteException extends Exception {

    public DuplicateVoteException(String message) {
        super(message);
    }
}