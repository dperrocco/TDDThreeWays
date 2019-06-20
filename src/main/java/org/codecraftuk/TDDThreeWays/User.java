package org.codecraftuk.TDDThreeWays;

public class User {

    private int balance = 1;

    public int getBalance() {
        return balance;
    }

    public void makeDeposit(Deposit deposit) {
        balance+=deposit.getAmount();
    }
}
