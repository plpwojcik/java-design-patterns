package pl.pwojcik.patterns.observer;

public class FirstObserver implements Observer {


    public void update(String s, int i) {
        System.out.println("FirstObserver: my value in " + s + "is now: " + i);
    }
}
