package com.learn.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();

        cars.add("Mercedes");
        cars.add("Ferrari");    //alphabetical Order output
        cars.add("Audy");       // Repeated Elements wont be printed
        cars.add("Bugati");
        cars.add("Ferrari");

        Iterator<String> itr = cars.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
