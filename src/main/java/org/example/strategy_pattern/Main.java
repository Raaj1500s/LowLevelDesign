package org.example.strategy_pattern;

import org.example.strategy_pattern.cart.OfflineCart;
import org.example.strategy_pattern.cart.OnlineCart;
import org.example.strategy_pattern.cart.ShoppingCart;
import org.example.strategy_pattern.payment_strategy.CashPayment;
import org.example.strategy_pattern.payment_strategy.PaymentStrategy;
import org.example.strategy_pattern.payment_strategy.UPI_Payment;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new UPI_Payment();
        ShoppingCart cart = new OnlineCart(paymentStrategy);
        cart.pay();

        paymentStrategy = new CashPayment();
        cart = new OfflineCart(paymentStrategy);
        cart.pay();
    }
}