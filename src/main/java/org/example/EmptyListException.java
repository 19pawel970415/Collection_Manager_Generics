package org.example;

public class EmptyListException extends RuntimeException {
    @Override
    public String getMessage() {
        return "The list is empty!";
    }
}
