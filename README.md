Zadanie: Biblioteka Kolekcji Generycznych
Opis: Twoim zadaniem jest stworzenie biblioteki klas generycznych, która umożliwi zarządzanie różnymi typami kolekcji danych. Biblioteka powinna obsługiwać typy generyczne, metody generyczne, wildcardy, oraz ograniczenia typów.

Wymagania:
Interfejs CollectionManager<T>:

Zdefiniuj generyczny interfejs CollectionManager<T>, który będzie miał następujące metody:
void addItem(T item): Dodaje element do kolekcji.
T getItem(int index): Zwraca element z kolekcji na podanej pozycji.
int getSize(): Zwraca liczbę elementów w kolekcji.
List<T> getAllItems(): Zwraca listę wszystkich elementów z kolekcji.
T findMax(Comparator<? super T> comparator): Zwraca największy element w kolekcji na podstawie przekazanego komparatora.
Klasa ListManager<T>:

Zaimplementuj interfejs CollectionManager<T> w klasie ListManager<T>, która będzie korzystać z listy (List<T>) jako wewnętrznej struktury danych.
Klasa BoundedNumberManager<T extends Number>:

Stwórz klasę BoundedNumberManager<T extends Number>, która również zaimplementuje interfejs CollectionManager<T>. Klasa ta będzie zarządzać kolekcją liczb (np. Integer, Double).
Dodaj dodatkową metodę:
double calculateSum(): Zwraca sumę wszystkich elementów w kolekcji.
Wildcards:

Stwórz metodę generyczną mergeCollections, która przyjmie dwa obiekty CollectionManager<? extends T> i połączy je w nową kolekcję typu CollectionManager<T>.
Metoda powinna zwracać nową kolekcję zawierającą elementy z obu kolekcji.
Testowanie:

Napisz klasę Main z metodą main, w której przetestujesz działanie stworzonej biblioteki.
Utwórz instancje klasy ListManager<String> i BoundedNumberManager<Integer>, dodaj kilka elementów do każdej z nich, a następnie przetestuj wszystkie dostępne metody, w tym mergeCollections.
