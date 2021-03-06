package pl.pwojcik.patterns.observer;

interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(int value);
}
