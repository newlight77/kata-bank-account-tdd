package com.newlight77.kata.katabankaccount.service;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WithdrawServiceTest {

    private WithdrawService service;

    @Before
    public void init() {
        service = new WithdrawService();
    }

    @Test
    public void shouldDepositAPositiveAmount() {

        // Arrange
        double amount = 100;

        // Act
        double balance = service.withdraw(amount);

        // Assert
        Assertions.assertThat(balance).isEqualTo(-100.00);
    }
}
