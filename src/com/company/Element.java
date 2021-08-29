package com.company;

public class Element <T extends Comparable<T>>
        implements Comparable<Element<T>> {

    private final T key;

    public Element(T key) {
        this.key = key;

    }
    public T getKey() {
        return this.key;
    }

    @Override
    public int compareTo(Element<T> o) {
        return this.getKey().compareTo(o.getKey());
    }
}
