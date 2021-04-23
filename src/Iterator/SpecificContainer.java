package Iterator;

import java.util.ArrayList;

public class SpecificContainer<T> implements Container<T> {
    private final ArrayList<T> elements;

    public SpecificContainer() {
        this.elements = new ArrayList<>();
    }

    public T get(int index) {
        return elements.get(index);
    }

    public void set(int index, T value) {
        this.elements.add(index, value);
    }

    public int count() {
        return this.elements.size();
    }

    @Override
    public Iterator<T> createIterator() {
        return new SpecificIterator<T>(this);
    }
}
