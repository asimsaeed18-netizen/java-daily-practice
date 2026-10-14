
package com.example.week_1.day_3;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

    public static void main(String[] args) {

        // Part 1: List<Object> is not the parent of List<String>

        List<String> names = new ArrayList<>();
        names.add("Asim");
        names.add("Ali");

        /*String extends Object, but List<String> does not extend List<Object>.
        // Java does not allow this assignment because it would break type safety.
        // List<Object> objects = names;

        // If this assignment were allowed, an Integer could be added
        // through the objects reference, even though names should contain Strings.
         objects.add(100);*/

        System.out.println("Names: " + names);


        // Part 2: Using List<? extends Number>

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        // ? extends Number means the list's element type is Number
        // or an unknown subtype of Number, such as Integer or Double.
        List<? extends Number> values = numbers;

        // We can safely read an element as a Number.
        Number firstValue = values.get(0);
        System.out.println("First number: " + firstValue);

        // We cannot safely add an Integer because values might refer
        // to a List<Double> or another subtype of Number.
        // values.add(30);
    }
}