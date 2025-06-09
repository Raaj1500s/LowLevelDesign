package org.example.strategy_pattern.payment_strategy;

public class UPI_Payment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing through UPI");
    }
}

