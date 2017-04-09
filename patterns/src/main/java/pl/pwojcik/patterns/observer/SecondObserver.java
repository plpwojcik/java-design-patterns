package pl.pwojcik.patterns.observer;

public class SecondObserver implements Observer {

    public void update(String s, int i) {
        System.out.println("SecondObserver: my value in " + s + "is now: " + i);
    }
}
