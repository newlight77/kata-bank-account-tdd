package com.newlight77.kata.katabankaccount.service;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DepositServiceTest {

    private OperationService service;

    @Before
    public void init() {

    }

    @Test
    public void shouldDepositAPositiveAmount() {

        // Arrange
        service = new OperationService();
        double amount = 100;

        // Act
        double balance = service.deposit(amount);

        // Assert
        Assertions.assertThat(balance).isEqualTo(100.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowDepositNegativeAmount() {

        // Arrange
        service = new OperationService();
        double amount = -100;

        // Act
        double balance = service.deposit(amount);

        // Assert
        // expected an exception

    }

    @Test
    public void shouldWithdraWithPositiveAmount() {

        // Arrange
        service = new OperationService();
        double amount = 100;

        // Act
        double balance = service.withdraw(amount);

        // Assert
        Assertions.assertThat(balance).isEqualTo(-100.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shoulNotAllowdWithdralWithNegativeAmount() {

        // Arrange
        service = new OperationService();
        double amount = -100;

        // Act
        double balance = service.withdraw(amount);

        // Assert
        // expected an exception
    }
}
