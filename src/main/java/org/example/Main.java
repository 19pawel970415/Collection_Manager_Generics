package org.example;

public class Main {
    public static void main(String[] args) {

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