package pl.pwojcik.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FirstSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int value;

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int updatedValue) {
        for(Observer observer : observers) {
            observer.update(this.getClass().getSimpleName(), updatedValue);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

}
