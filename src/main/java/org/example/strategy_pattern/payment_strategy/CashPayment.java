package org.example.strategy_pattern.payment_strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing through Cash");
    }
}
