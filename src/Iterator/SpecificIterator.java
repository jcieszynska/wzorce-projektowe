package Iterator;

public class SpecificIterator<T> implements Iterator<T>{
    private final SpecificContainer<T> container;
    private int current = 0;

    public SpecificIterator(SpecificContainer<T> container) {
        this.container = container;
    }

    @Override
    public T first() {
        return container.get(0);
    }

    @Override
    public T next() {
        T ret = null;
        if (current < container.count() - 1) {
            ret = container.get(++current);
        }
        return ret;
    }

    @Override
    public T getElement() {
        return container.get(current);
    }

    @Override
    public boolean isEnd() {
        return current >= container.count() - 1;
    }
}
