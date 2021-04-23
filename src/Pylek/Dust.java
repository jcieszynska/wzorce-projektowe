package Pylek;

public abstract class Dust {
    protected final String name;

    public Dust(String name) {
        this.name = name;
    }

    abstract void sampleMethod(int externalData);
}
