package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayList");
        StringList stringList = new StringListImpl();
        stringList.add("a1");
        stringList.add("a2");
        stringList.add("a3");
        stringList.add("a4");


        stringList.toArray();



        stringList.isEmpty();
        stringList.size();

        String[] arr = new String[] {"item7", "item2", "item3", "item4", "item5"};
        stringList.equals(arr);




    }
}