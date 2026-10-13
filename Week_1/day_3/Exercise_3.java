package com.example.week_1.day_3;
import java.util.HashMap;

public class Exercise_3 {

    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }
        System.out.println("Word Frequencies:");
        System.out.println(wordCount);
    }
}