package org.example;

import java.util.Comparator;
import java.util.List;

public interface CollectionManager<T> {

    void addItem(T item);
    T getItem(int index);
    int getSize();
    List<T> getAllItems();
    T findMax(Comparator<? super T> comparator);

}
