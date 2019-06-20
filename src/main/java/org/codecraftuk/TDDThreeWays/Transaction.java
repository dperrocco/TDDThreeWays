package org.codecraftuk.TDDThreeWays;

public abstract class Transaction {
    private int amount;

    public Transaction(int transactionAmount) {
        amount = transactionAmount;
    }

    public String getReference() {
        return "Reference";
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return "20.06.2019";
    }
}
