package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class BoundedNumberManager<T extends Number> implements CollectionManager<T> {

    private List<T> elements = new ArrayList<>();

    @Override
    public void addItem(T item) {
        elements.add(item);
    }

    @Override
    public T getItem(int index) {
        return elements.get(index);
    }

    @Override
    public int getSize() {
        return elements.size();
    }

    @Override
    public List<T> getAllItems() {
        return elements;
    }

    @Override
    public T findMax(Comparator<? super T> comparator) {
        return elements.stream()
                .max(comparator)
                .orElseThrow(EmptyListException::new);
    }

    double calculateSum() {
        return elements.stream()
                .mapToDouble(v -> v.doubleValue())
                .sum();
    }
}
