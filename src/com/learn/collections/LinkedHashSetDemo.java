package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo{

    public static void main(String[] args) {
        LinkedHashSet<String>laptops = new LinkedHashSet<>();
        laptops.add("Dell");
        laptops.add("Lenovo");
        laptops.add("Asus");

        laptops.add("Hp");
        laptops.add("Hp");

        Iterator itr = laptops.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
