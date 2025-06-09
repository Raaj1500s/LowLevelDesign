package org.example.observer_pattern;

import org.example.observer_pattern.observable.MobileObservableImpl;
import org.example.observer_pattern.observable.StockObservable;
import org.example.observer_pattern.observer.EmailAlertObserverImpl;
import org.example.observer_pattern.observer.AlertObserver;
import org.example.observer_pattern.observer.SMSAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        StockObservable obj = new MobileObservableImpl();
        AlertObserver user1 = new EmailAlertObserverImpl("Raaz", "rk@gmail.com", obj);
        obj.addUser(user1);

        AlertObserver user2 = new SMSAlertObserverImpl("RK", "63007039", obj);
        obj.addUser(user2);

        obj.setData(10);
    }
}
