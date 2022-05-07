package com.example.testdrivendevelopment.currency;

public class Franc extends Money {
    protected Franc(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

