package com.company;

public class MyQueue {
    private MyLinkedListParem<String> myLinkedListParem = new MyLinkedListParem<>();
    public int count = myLinkedListParem.size;


    public void enqueue(String str) {
        myLinkedListParem.add(str);
    }

    public void dequeue() {
        myLinkedListParem.remove(0);
    }

    public String toString() {
        return myLinkedListParem.toString();
    }

    public boolean isEmpty() {
        if (count == 0) return false;
        return true;
    }

    public String peek() throws IllegalAccessException {
        return myLinkedListParem.get(0);
    }

}
