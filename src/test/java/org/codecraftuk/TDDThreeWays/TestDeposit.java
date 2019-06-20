package org.codecraftuk.TDDThreeWays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestDeposit {

    @Test
    public void testThatDepositHasDescription() {
        Deposit deposit = new Deposit(50);
        String expected = "Reference";
        String actual = deposit.getReference();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatDepositHasAmount() {
        Deposit deposit = new Deposit(20);
        int expected = 20;
        int actual = deposit.getAmount();
        assertThat(actual, is(equalTo(expected)));
    }
}
