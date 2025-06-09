package org.example.strategy_pattern.payment_strategy;

public class CreditCard_Payment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing through Credit Card");
    }
}
