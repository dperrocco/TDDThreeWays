package org.codecraftuk.TDDThreeWays;

public class Deposit {
    private int amount;

    public Deposit(int depositAmount) {
        amount = depositAmount;
    }

    public String getReference() {
        return "Reference";
    }

    public int getAmount() {
        return amount;
    }
}
