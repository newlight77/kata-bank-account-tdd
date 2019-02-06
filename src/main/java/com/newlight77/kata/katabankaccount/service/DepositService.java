package com.newlight77.kata.katabankaccount.service;

public class DepositService {

    double balance = 0;

    public double deposit(double amount) {

        balance += amount;

        return balance;
    }
}
