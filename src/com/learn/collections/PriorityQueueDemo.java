package com.learn.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> CustomerQueue = new PriorityQueue<>();

        CustomerQueue.add("Amit");
        CustomerQueue.add("Rakesh");
        CustomerQueue.add("Shivam");

        System.out.println("Lead is "+ CustomerQueue.peek());
        Iterator<String> itr = CustomerQueue.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
