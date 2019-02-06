package com.newlight77.kata.katabankaccount.service;

public class WithdrawService {

    double balance = 0;

    public double withdraw(double amount) {

        balance -= amount;

        return balance;
    }

}
