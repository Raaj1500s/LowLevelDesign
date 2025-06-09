package org.example.strategy_pattern.cart;

import org.example.strategy_pattern.payment_strategy.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy obj) {
        this.paymentStrategy = obj;
    }

    public void pay() {
        paymentStrategy.processPayment();
    }
}
