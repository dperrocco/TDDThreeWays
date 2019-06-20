package org.codecraftuk.TDDThreeWays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestUser {
    private User user;

    @Before
    public void setUp() {
        user = new User();
    }

    @Test
    public void testThatUseCanCheckBalance() {
        int expected = 1;
        int actual = user.getBalance();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatUserCanDepositAnAmount(){
        Deposit deposit = new Deposit(50);
        int expected = 51;
        user.makeDeposit(deposit);
        int actual = user.getBalance();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatUserCanWithdrawAnAmount() {
        User 
    }
}
