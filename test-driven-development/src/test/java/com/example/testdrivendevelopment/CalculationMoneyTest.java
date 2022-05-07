package com.example.testdrivendevelopment;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.example.testdrivendevelopment.currency.Money;
import org.junit.jupiter.api.Test;

class CalculationMoneyTest {

    @Test
    void multiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void multiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void equalsDollar() {
        Money five1 = Money.dollar(5);
        Money five2 = Money.dollar(5);
        Money six = Money.dollar(6);

        assertAll(
                () -> assertEquals(five1, five2),
                () -> assertNotEquals(five1, six)
        );
    }

    @Test
    void equalsFranc() {
        Money five1 = Money.franc(5);
        Money five2 = Money.franc(5);
        Money six = Money.franc(6);

        assertAll(
                () -> assertEquals(five1, five2),
                () -> assertNotEquals(five1, six)
        );
    }

    @Test
    void notEqualsDollarAndFranc() {
        Money franc = Money.franc(5);
        Money dollar = Money.dollar(5);
        assertNotEquals(franc, dollar);
    }
}
