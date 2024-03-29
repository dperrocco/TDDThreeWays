package org.codecraftuk.TDDThreeWays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestDeposit {

    private Deposit deposit;

    @Before
    public void setUp(){
        deposit = new Deposit(25);
    }

    @Test
    public void testThatDepositHasDescription() {
        String expected = "Reference";
        String actual = deposit.getReference();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatDepositHasAmount() {
        int expected = 25;
        int actual = deposit.getAmount();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatDepositHasDate(){
        String expected = "20.06.2019";
        String actual = deposit.getDate();
        assertThat(actual, is(equalTo(expected)));
    }
}
