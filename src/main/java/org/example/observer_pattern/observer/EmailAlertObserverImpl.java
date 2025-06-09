package org.example.observer_pattern.observer;

import org.example.observer_pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements AlertObserver {

    String userName;
    String email;
    StockObservable obj;

    public EmailAlertObserverImpl(String userName, String email, StockObservable obj) {
        this.userName = userName;
        this.email = email;
        this.obj = obj;
    }
    @Override
    public void updateUsers() {
        System.out.println("Hey there! Hurry up , Extra stock available " + obj.getData());
        sendMail("Stock may close soon...............");
    }

    void sendMail(String msg) {
        System.out.println("Email sent to " + userName + " " + email + " with message as " + msg);
    }
}
