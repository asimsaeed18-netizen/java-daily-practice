
package com.example.week_1.day_3;

import java.util.ArrayList;

public class Exercise_1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Asim");
        names.add("Ali");
        names.add("Ahmad");
        names.add("Mubeen");
        names.add("Adam");
        names.add("Saim");
        names.add("Hassan");
        names.add("Edy");
        names.add("Qasim");
        names.add("Huzaifa");

        names.removeIf(name -> name.length() < 4);

        System.out.println(names);
    }
}

