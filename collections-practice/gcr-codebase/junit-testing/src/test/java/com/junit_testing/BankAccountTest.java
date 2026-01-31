package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    // Test deposit
    @Test
    void testDepositIncreasesBalance() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // Test withdrawal
    @Test
    void testWithdrawReducesBalance() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    
    @Test
    void testWithdrawWithInsufficientFunds() {
        assertThrows(IllegalStateException.class, () ->
                account.withdraw(2000.0)
        );
    }


    @Test
    void testDepositNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                account.deposit(-100)
        );
    }
}