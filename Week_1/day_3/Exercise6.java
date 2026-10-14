package com.example.week_1.day_3;

import java.util.List;
import java.util.ArrayList;

public class Exercise6 {
    public static <T> T firstOrDefault(List<T> list, T fallback){
        if (list.isEmpty()){
            return fallback;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Asim");
        names.add("Ali");

        System.out.println(firstOrDefault(names, "Unknown"));

        List<String> emptyNames = new ArrayList<>();
        System.out.println(firstOrDefault(emptyNames, "Unknown"));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println(firstOrDefault(numbers, 0));
    }
}
