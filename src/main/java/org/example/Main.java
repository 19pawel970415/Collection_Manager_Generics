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

        System.out.println("All items in stringManager: " + stringManager.getAllItems());
        System.out.println("Max in stringManager: " + stringManager.findMax(String::compareTo));

        try {
            stringManager.addItem(null);
            System.out.println("Added null to stringManager: " + stringManager.getAllItems());
        } catch (Exception e) {
            System.out.println("Failed to add null to stringManager: " + e.getMessage());
        }

        System.out.println("Sum in numberManager: " + numberManager.calculateSum());

        BoundedNumberManager<Double> emptyNumberManager = new BoundedNumberManager<>();
        try {
            System.out.println("Max in emptyNumberManager: " + emptyNumberManager.findMax(Double::compareTo));
        } catch (EmptyListException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        CollectionManager<String> mergedCollection = mergeCollections(
                stringManager,
                new ListManager<>(List.of("date", "elderberry"))
        );
        System.out.println("Merged Collection: " + mergedCollection.getAllItems());

        CollectionManager<String> mergedWithEmpty = mergeCollections(stringManager, new ListManager<>());
        System.out.println("Merged with empty collection: " + mergedWithEmpty.getAllItems());

        CollectionManager<String> emptyMerged = mergeCollections(new ListManager<>(), new ListManager<>());
        System.out.println("Merged two empty collections: " + emptyMerged.getAllItems());

        BoundedNumberManager<Double> doubleManager = new BoundedNumberManager<>();
        doubleManager.addItem(5.5);
        doubleManager.addItem(15.5);
        doubleManager.addItem(25.5);
        System.out.println("Sum in doubleManager: " + doubleManager.calculateSum());
        System.out.println("Max in doubleManager: " + doubleManager.findMax(Double::compareTo));
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
