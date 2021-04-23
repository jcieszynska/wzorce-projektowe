package com.company.Iterator;

public interface Iterator<T> {
    T first();
    T next();
    T getElement();
    boolean isEnd();
}
