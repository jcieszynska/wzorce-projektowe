package Obserwator;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void joinObserver(Observer observer) {
        observers.add(observer);
    }

    public void disconnectObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
