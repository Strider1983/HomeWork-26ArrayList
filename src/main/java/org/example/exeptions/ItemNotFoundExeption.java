package org.example.exeptions;

public class ItemNotFoundExeption extends RuntimeException{
    public ItemNotFoundExeption(String message) {
        super(message);
    }
}
