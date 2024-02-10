package org.example;
public class LinkedList implements List301 {
    Node head;
    int size = 0;

    static class Node {
        Integer data;
        Node next;

        Node(Integer d) {
            data = d;
        }
    }

    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        if (size == 0) {
            head = new Node(e);
        }
        else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(e);
        }
        size++;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    @Override
    public Integer pop() {
        Node node = head;
        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        Integer x = node.next.data;
        node.next = null;
        size--;
        return x;
    }

    @Override
    public int size() {
        return size;
    }
}