package Obserwator;

public class Main {
    public static void main(String[] args) {
        SpecificObservable observable = new SpecificObservable();
        observable.joinObserver(new SpecificObserver("Observer A", observable));
        observable.joinObserver(new SpecificObserver("Observer B", observable));

        observable.state = "ABC";
        observable.notifyObservers();
    }
}
