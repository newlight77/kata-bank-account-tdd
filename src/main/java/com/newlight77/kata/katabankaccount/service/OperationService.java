package com.newlight77.kata.katabankaccount.service;

public class OperationService {

    private double balance = 0;

    public double deposit(double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("The amount for deposit must be positif");
        }

        balance += amount;

        return balance;
    }

    public double withdraw(double amount) {

        balance -= amount;

        return balance;
    }
}