package com.deposit;

public class LoanDeposit extends Deposit {

    public LoanDeposit(double amount) {
        super(amount);
    }

    @Override
    public double calculateProfit() {
        return amount * 0.03; // 3% profit for example
    }
}
