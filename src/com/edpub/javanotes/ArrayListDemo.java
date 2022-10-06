package com.edpub.javanotes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        //On left we keep interface (here List) and on right we keep Concrete implementation (here ArrayList)
        List<Integer> arrayList = new ArrayList<Integer>(5);//initial capacity can be omitted but not a good practice to omit, we must keep some value

        //QUES: Why empty list even if the initial capacity is 5
        System.out.println(arrayList); //Prints the whole array

        //We can add any number of elements (even more than initial capacity)
        for(int i=0;i<=5; ++i)
            arrayList.add(i);

        System.out.println(arrayList);


        arrayList.remove(3); //Removes element at given index

        System.out.println(arrayList);

        for(int i=0;i<arrayList.size(); ++i)
            System.out.println(arrayList.get(i)); //QUES: arrayList[i] does not work?

        //Enhanced for loop
        for (Integer x : arrayList) System.out.println(x);



    }
}
