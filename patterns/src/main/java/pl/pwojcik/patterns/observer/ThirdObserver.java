package pl.pwojcik.patterns.observer;

public class ThirdObserver implements Observer {

    public void update(String s, int i) {
        System.out.println("ThirdObserver: my value in " + s + "is now: " + i);
    }
}
