package com.learn.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {


    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Mango");//index 0
        fruits.add("Banana");//index 0
        fruits.add("Pineapple");//index 0
        fruits.add("Cocoa");//index 0
        fruits.add("Grapes");//index 0
        fruits.add("Mango");//index 0


        fruits.add(1,"Guava");


        Iterator itr = fruits.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
