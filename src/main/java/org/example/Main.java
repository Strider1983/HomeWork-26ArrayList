package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayList");
        StringList stringList = new StringListImpl();
        stringList.add("item1");
        stringList.add("item2");
        stringList.add("item3");
        stringList.add("item4");
        stringList.add("item5");
        stringList.remove("item4");




    }
}