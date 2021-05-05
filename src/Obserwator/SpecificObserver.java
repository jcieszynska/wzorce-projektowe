package Obserwator;

public class SpecificObserver implements Observer {
    private final String name;
    private String state;
    public final SpecificObservable observable;

    public SpecificObserver(String name, SpecificObservable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        state = observable.state;
        System.out.println("Observer " + name + " has new a state: " + state + ".");
    }
}
