package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListManager<String> stringManager = new ListManager<>();
        stringManager.addItem("apple");
        stringManager.addItem("banana");
        stringManager.addItem("cherry");

        BoundedNumberManager<Integer> numberManager = new BoundedNumberManager<>();
        numberManager.addItem(10);
        numberManager.addItem(20);
        numberManager.addItem(30);

        System.out.println("Max in stringManager: " + stringManager.findMax(String::compareTo));
        System.out.println("Sum in numberManager: " + numberManager.calculateSum());

        CollectionManager<String> mergedCollection = mergeCollections(stringManager, new ListManager<>(List.of("date", "elderberry")));
        System.out.println("Merged Collection: " + mergedCollection.getAllItems());
    }

    private static <T> CollectionManager<T> mergeCollections(CollectionManager<? extends T> collectionManager1, CollectionManager<? extends T> collectionManager2) {
        CollectionManager<T> collectionManager = new ListManager<>();

        for (T item : collectionManager1.getAllItems()) {
            collectionManager.addItem(item);
        }
        for (T item : collectionManager2.getAllItems()) {
            collectionManager.addItem(item);
        }
        return collectionManager;
    }
}