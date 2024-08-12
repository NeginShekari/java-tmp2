package com.deposit;

public class LongTermDeposit extends Deposit {

    public LongTermDeposit(double amount) {
        super(amount);
    }

    @Override
    public double calculateProfit() {
        return amount * 0.05; // 5% profit for example
    }
}
