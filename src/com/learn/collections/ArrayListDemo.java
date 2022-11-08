package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> participant = new ArrayList<>();

        participant.add("Nishant");//index 0
        participant.add("Asif");//1
        participant.add("Akash");//2
        participant.add("Akshay");//3
        participant.add("Amit");//4
        participant.add(1,"Dhoni");


        Iterator itr = participant.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
