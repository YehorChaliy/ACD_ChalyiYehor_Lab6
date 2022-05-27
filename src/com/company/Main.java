package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int choice;
        //1 task
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("one");
        myQueue.enqueue("two");
        myQueue.enqueue("Three");
        myQueue.enqueue("four");
        System.out.println(myQueue.toString() + "\n");

        System.out.println("Видаляємо 2 елементи з черги та додати рядок 'inf':");

            myQueue.dequeue();
            myQueue.dequeue();
            myQueue.enqueue("inf");
            System.out.println(myQueue.toString() + "\n");

        //2 task
        System.out.println("Виводимо сумарну довжину рядків:");
        myQueue.dequeue();
        String res = myQueue.peek();
        myQueue.dequeue();
        res += myQueue.peek();
        System.out.println("Довжина = " + res.length());
    }
}