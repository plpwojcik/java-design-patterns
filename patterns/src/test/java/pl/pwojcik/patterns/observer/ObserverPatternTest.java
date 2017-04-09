package pl.pwojcik.patterns.observer;

import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void observerPatternTest() {
        Observer o = new Observer();
        Subject sub = new SubjectImpl();
        sub.register(o);
        System.out.println("Setting Flag = 5 ");
        sub.notifyObservers();
        System.out.println("Setting Flag = 25 ");
        sub.notifyObservers();
        sub.unregister(o);
        System.out.println("Setting Flag = 50 ");
        sub.notifyObservers();
    }
}
