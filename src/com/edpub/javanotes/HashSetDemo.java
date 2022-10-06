package com.edpub.javanotes;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String args[]){
        Set<String> hashSet = new HashSet<>();//These are basically sets

        //elements can be added using add method
        //add method returns true if element is added successfully else false
        hashSet.add("a");
        boolean r1 = hashSet.add("a");
        hashSet.add("b");

        System.out.println(hashSet);
        System.out.println(r1);//prints false means duplicate values are not stored

        boolean r2 = hashSet.contains("a");
        System.out.println(r2);

        hashSet.remove("a");
        System.out.println(hashSet);

        for(String item: hashSet){
            System.out.println(item);
        }


    }
}
