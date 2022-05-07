package com.example.testdrivendevelopment.currency;

public class Dollar extends Money {
    protected Dollar(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
