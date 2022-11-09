package com.learn.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEmp {
    public static void main(String[] args) {
        PriorityQueue<String> emp = new PriorityQueue<>();

        emp.add("HR");
        emp.add("Dev");
        emp.add("Tester");


        emp.remove("Dev");
        emp.removeAll(emp);

        System.out.println("Lead is "+ emp.peek());
        Iterator<String> itr = emp.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}