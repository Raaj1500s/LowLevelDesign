package org.example.strategy_pattern.cart;

import org.example.strategy_pattern.payment_strategy.PaymentStrategy;

public class OfflineCart extends ShoppingCart {
    public OfflineCart(PaymentStrategy obj) {
        super(obj);
    }
}
