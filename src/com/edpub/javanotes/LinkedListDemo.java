package com.edpub.javanotes;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.addLast("c");
        list.addFirst("z");

        //index based insertion
        list.add(2, "y");

        list.remove(1);//delete element using index
        list.removeFirst();
        list.removeLast();
        list.remove("b");//delete element

        System.out.println(list);
    }
}
