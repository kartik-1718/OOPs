package com.learn.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo    {
    public static void main(String[] args) {

        HashSet<String> members= new HashSet<>();
        members.add("aaaaaa");
        members.add("bbbbbbbb");
        members.add("ccccccc");//Contains Unique Elements
        members.add("ccccccc");

        members.remove("aaaaaa");

        Iterator<String> itr= members.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
