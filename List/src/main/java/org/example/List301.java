package org.example;

public interface List301 {
    void add(Integer e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    Integer pop();
    Integer get(int index) throws IndexOutOfBoundsException;
    int size();
}