package com.deposit;

public abstract class Deposit {
    protected double amount;

    public Deposit(double amount) {
        this.amount = amount;
    }

    public abstract double calculateProfit();

    public double getAmount() {
        return amount;
    }
}
