package org.example.observer_pattern.observer;

import org.example.observer_pattern.observable.StockObservable;

public class SMSAlertObserverImpl implements AlertObserver {

    String userName;
    String mobileNo;
    StockObservable obj;

    public SMSAlertObserverImpl(String userName, String mobileNo, StockObservable obj) {
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.obj = obj;
    }
    @Override
    public void updateUsers() {
        System.out.println("Hey there! Hurry up , Extra stock available " + obj.getData());
        sendSMS("Stock may close soon.........");
    }

    void sendSMS(String msg) {
        System.out.println("SMS sent to " + userName + " " + mobileNo + " with message as " + msg);
    }
}
