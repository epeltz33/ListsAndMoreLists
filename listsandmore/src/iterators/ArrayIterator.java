package iterators

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] list;
    private int size;
    private int current;


    public ArrayIterator(E[] list, int size) {
        this.list = list;
        this.size = size;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        E temp = list[current];
        current++;
        return temp;
    }
}

