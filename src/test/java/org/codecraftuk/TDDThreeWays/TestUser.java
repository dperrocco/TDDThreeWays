package org.codecraftuk.TDDThreeWays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestUser {
    @Test
    public void testThatUseCanCheckBalance() {
        User user = new User();
        int expected = 1;
        int actual = user.getBalance();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatUserCanDepositAnAmount(){
        User user = new User();
        Deposit deposit = new Deposit(50);
        int expected = 51;
        user.makeDeposit(deposit);
        int actual = user.getBalance();
        assertThat(actual, is(equalTo(expected)));
    }
}
