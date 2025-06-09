package org.example.observer_pattern.observable;

import org.example.observer_pattern.observer.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MobileObservableImpl implements StockObservable {
    int stock;
    List<AlertObserver> subscribers = new ArrayList<>();
    @Override
    public void addUser(AlertObserver obj) {
        subscribers.add(obj);
    }

    @Override
    public void removeUser(AlertObserver obj) {
        subscribers.remove(obj);
    }

    @Override
    public void notifyUsers() {
        for(AlertObserver observer : subscribers)
            observer.updateUsers();
    }

    @Override
    public void setData(int data) {
        if (stock == 0) {
            stock += data;
            notifyUsers();
        } else {
            stock += data;
        }
    }

    @Override
    public int getData() {
        return stock;
    }
}
