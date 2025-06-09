package org.example.strategy_pattern.cart;

import org.example.strategy_pattern.payment_strategy.PaymentStrategy;

public class OnlineCart extends ShoppingCart {
    public OnlineCart(PaymentStrategy obj) {
        super(obj);
    }
}
