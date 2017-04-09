package pl.pwojcik.patterns.observer;

import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void observerPatternTest() {
        FirstSubject firstSubject = new FirstSubject();
        SecondSubject secondSubject = new SecondSubject();

        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();
        ThirdObserver thirdObserver = new ThirdObserver();

        firstSubject.register(firstObserver);
        firstSubject.register(secondObserver);

        secondSubject.register(secondObserver);
        secondSubject.register(thirdObserver);

        firstSubject.setValue(50);
        System.out.println();

        secondSubject.setValue(50);
        System.out.println();

        firstSubject.unregister(secondObserver);

        firstSubject.setValue(550);
        System.out.println();

        secondSubject.setValue(750);
    }
}
