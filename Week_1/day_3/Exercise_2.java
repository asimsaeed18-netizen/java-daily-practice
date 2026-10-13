package com.example.week_1.day_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise_2 {


    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Asim");
        names.add("Ali");
        names.add("Umair");
        names.add("Ali");
        System.out.println("Original List: " + names);

        HashSet<String> uniqueNames = new HashSet<>(names);
        System.out.println("Using HashSet: " + uniqueNames);

        LinkedHashSet<String> orderedNames = new LinkedHashSet<>(names);
        System.out.println("Using LinkedHashSet: " + orderedNames);

    }

}
