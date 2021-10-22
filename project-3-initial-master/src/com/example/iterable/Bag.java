package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    private List<T> bag;

    public Bag() { bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override
    public int size() {
        return this.bag.size();
    }

    @Override
    public void add(T item) {

        this.bag.add(item);

    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }
}
