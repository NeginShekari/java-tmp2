package com.deposit;

public class ShortTermDeposit extends Deposit {

    public ShortTermDeposit(double amount) {
        super(amount);
    }

    @Override
    public double calculateProfit() {
        return amount * 0.02; // 2% profit for example
    }
}
