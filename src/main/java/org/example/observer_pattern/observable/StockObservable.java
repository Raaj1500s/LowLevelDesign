package org.example.observer_pattern.observable;

import org.example.observer_pattern.observer.AlertObserver;

public interface StockObservable {
    void addUser(AlertObserver obj);

    void removeUser(AlertObserver obj);

    void notifyUsers();

    void setData(int data);

    int getData();
}
