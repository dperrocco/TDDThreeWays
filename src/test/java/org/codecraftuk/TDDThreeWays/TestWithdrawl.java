package org.codecraftuk.TDDThreeWays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestWithdrawl {
    private Withdrawl withdrawl;

    @Before
    public void setUp() {
        withdrawl = new Withdrawl(25);
    }

    @Test
    public void testThatWithdrawlHasDescription() {
        String expected = "Reference";
        String actual = withdrawl.getReference();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatWithdrawlHasAmount() {
        int expected = 25;
        int actual = withdrawl.getAmount();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatWithdrawlHasDate(){
        String expected = "20.06.2019";
        String actual = withdrawl.getDate();
        assertThat(actual, is(equalTo(expected)));
    }
}
