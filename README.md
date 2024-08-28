Task: Generic Collection Library

Description: Your task is to create a library of generic classes that enables the management of different types of data collections. The library should handle generic types, generic methods, wildcards, and type constraints.

Requirements:

CollectionManager<T> Interface:

Define a generic interface CollectionManager<T> that has the following methods:

void addItem(T item): Adds an item to the collection.
T getItem(int index): Returns the item at the specified index in the collection.
int getSize(): Returns the number of elements in the collection.
List<T> getAllItems(): Returns a list of all items in the collection.
T findMax(Comparator<? super T> comparator): Returns the maximum item in the collection based on the provided comparator.
ListManager<T> Class:

Implement the CollectionManager<T> interface in the ListManager<T> class, which will use a List<T> as its internal data structure.

BoundedNumberManager<T extends Number> Class:

Create the BoundedNumberManager<T extends Number> class that also implements the CollectionManager<T> interface. This class will manage a collection of numbers (e.g., Integer, Double).

Add an additional method:
double calculateSum(): Returns the sum of all elements in the collection.
Wildcards:

Create a generic method mergeCollections that takes two CollectionManager<? extends T> objects and merges them into a new CollectionManager<T> collection.

The method should return a new collection containing elements from both collections.
Testing:

Write a Main class with a main method where you will test the functionality of the created library.

Create instances of ListManager<String> and BoundedNumberManager<Integer>, add some elements to each, and then test all available methods, including mergeCollections.
