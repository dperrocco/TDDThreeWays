package org.codecraftuk.TDDThreeWays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestTransaction {

    private Transaction transaction;

    @Before
    public void setUp(){
        transaction = createNewNaiveTransactionImplementation();
    }

    @Test
    public void testThatTransactionHasDescription() {
        String expected = "Reference";
        String actual = transaction.getReference();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatDepositHasAmount() {
        int expected = 25;
        int actual = transaction.getAmount();
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testThatDepositHasDate(){
        String expected = "20.06.2019";
        String actual = transaction.getDate();
        assertThat(actual, is(equalTo(expected)));
    }

    private Transaction createNewNaiveTransactionImplementation() {
        return new Transaction(25) {};
    }
}
