package com.newlight77.kata.katabankaccount.service;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DepositServiceTest {

    private DepositService service;

    @Before
    public void init() {
        service = new DepositService();
    }

    @Test
    public void shouldDepositAPositiveAmount() {

        // Arrange
        double amount = 100;

        // Act
        double balance = service.deposit(amount);

        // Assert
        Assertions.assertThat(balance).isEqualTo(100.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowDepositNegativeAmount() {
        // Arrange
        double amount = -100;

        // Act
        double balance = service.deposit(amount);

        // Assert

    }
}
