package com.company;

import java.util.Arrays;

public class MyLinkedListParem<T> {
    Node head;
    int size;


    public void add(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(value));
        }
        size++;
    }

    public String toString() {
        Node temp = head;
        Object[] ar = new Object[size];
        int incr = 0;

        while (temp != null) {
            ar[incr++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(ar);
    }


    public T get(int number) throws IllegalAccessException {
        int incr = 0;
        Node temp = head;

        while (temp != null) {
            if (incr == number) {
                return (T) temp.getValue();
            } else {
                temp = temp.getNext();
                incr++;
            }
        }
        throw new IllegalArgumentException("Помилка введення!");
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int cur = 0;
        Node temp = head;

        while (temp != null) {
            if (cur == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                cur++;
            }
        }
    }

    public void reverse() {


        Node<T> prev = null;
        while (head != null) {
            Node<T> next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        head = prev;
    }


    public static class Node<T> {
        Node next;
        T value;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node(T value) {
            this.value = value;
        }
    }


}
