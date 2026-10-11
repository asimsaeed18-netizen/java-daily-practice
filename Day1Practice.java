package com.example.week_1.day_1;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Day1Practice {

    //Day 1 Exercise 1
   public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = 0;

        Day1Practice obj = new Day1Practice();
                int result = obj.sum(a,b);
        System.out.println("The sum of a & b is: "+ result);
    }

    //Day 1 exercise 2:

    /*public boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args){
        int n = 13;
        Day1Practice obj = new Day1Practice();
        boolean result = obj.isEven(n);
        System.out.println("Is " + n  +"even?" + result);

    }

    //Day 1 Exercise 3:

    public double celciusToFarhenheit(double c){
        double celciusToFarhenheit = (c * 9/5) + 32;
        return celciusToFarhenheit;
    }

    public static void main(String[] args){
        double c = 37.0;

        Day1Practice obj = new Day1Practice();
        double result = obj.celciusToFarhenheit(c);
        System.out.println("Farhenheit: " + result);
    }*/

    //Day 1 exercise 4:

    /*public int max(int a, int b, int c){
        int max;
        if(a>=b && a>=c){
            System.out.println("a is the maximum of three numbers");
            return a;
        }
        else if (b>=a && b>=c) {
            System.out.println("b is the maximum of three numbers");
            return b;
        }
        else {
            System.out.println("c is the maximum of three numbers");
            return c;
        }
    }

    public static void main(String[] args){
        int a = 100;
        int b = 108;
        int c = 4;

        Day1Practice obj = new Day1Practice();
        int result = obj.max(a,b,c);

        System.out.println(result);
    }*/

    //Day 1 exercise 5:
    /*
    public String grade(int score) {

        if (score < 0 || score > 100) {
            return "Invalid";
        }

        String grade = switch (score / 10) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        return grade;
    }

    public static void main(String[] args) {
        int score = 90;
        Day1Practice obj = new Day1Practice();
        String result = obj.grade(score);
        System.out.println("Your grade is: " + result);
    }

     */


    //Day 1 exercise 6:
    /*public String fizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        else if (n % 3 == 0) {
            return "Fizz";
        }
        else if (n % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(n);
        }
    }

    public static void main(String[] args) {
        int n = 25;
        Day1Practice obj = new Day1Practice();
        String result = obj.fizzBuzz(n);
        System.out.println("This is: " + result);
    }*/

    // Day 1 exercise 7:
    //factorial using loop:
   /* public static long factorial(int n){
        long result = 1;
        for(int i=1; i<=n; i++){
            result = result*i;
        }
        return result;
    }

    //factorial using recursion:
    public static long factorialRecursive(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        long result1 = factorial(n);
        long result2 = factorialRecursive(n);

        System.out.println("Factorial using loop: " + result1);
        System.out.println("Factorial using recursion: " + result2);
    }*/
//Day 1 Exercise 8:
    /* public static void main(String[] args) {

        Student s1 = new Student(1, "Ali");
        Student s2 = new Student(1, "Ali");

        System.out.println("Are students equal? " + s1.equals(s2));

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        System.out.println("Student 1 hashCode: " + s1.hashCode());
        System.out.println("Student 2 hashCode: " + s2.hashCode());
    }
*/

//Day 1 Exercise 9:
   /* public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("canon"));
        System.out.println(isPalindrome("nurses run"));
    }
    */

    //day 1 exercise 10:
    /*public static int countVowels(String s){
        s = s.toLowerCase();
        int count = 0;
        for(int i=0; i<s.length(); i++ ){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

        }
            return count;
    }

    public static void main(String[] args){
        System.out.println(countVowels("Lahore"));
    }*/

    //Day 1 exercise 11:
  /*  public static int sumArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }
    public static double averageArray(int[] num) {
        if (num.length == 0) {
            return 0.0;
        }
        double average = (double) sumArray(num) / num.length;
        return average;
    }

    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        System.out.println("Sum: " + sumArray(num));
        System.out.println("Average: " + averageArray(num));
    }
*/

    //Day 1 exercise 12:
    /* public static int[] reverseArray(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversed[nums.length - 1 - i] = nums[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] result = reverseArray(nums);
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        System.out.println("Reversed array: " + java.util.Arrays.toString(result));
    }*/

    //Day1 Exercise 13:
   /* public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Is this a number Prime? " + isPrime(n));
    }*/

    //day1 exercise 14:
    /*public static void main(String[] args) {

        String s1 = "hello";
        String s2 = new String("hello");

        // == compares whether two references point
        // to the same object.
        System.out.println("Using ==: " + (s1 == s2));

        // equals() compares the actual text
        // contained in the two strings.
        System.out.println("Using equals(): " + s1.equals(s2));
    }*/

    //day 1 exercise 15:
    /*public static void main(String[] args) {

        // 1. int is a primitive data type
        int number = 10;

        // 2. Integer is a wrapper class
        Integer integerNumber = 20;

        // 3. Autoboxing: int is converted to Integer automatically
        int value = 30;
        Integer boxedValue = value;

        // 4. Unboxing: Integer is converted to int automatically
        int unboxedValue = integerNumber;

        // 5. An Integer variable can hold null
        Integer emptyValue = null;

        // Display the results
        System.out.println("Primitive int: " + number);
        System.out.println("Integer object: " + integerNumber);
        System.out.println("Autoboxing result: " + boxedValue);
        System.out.println("Unboxing result: " + unboxedValue);
        System.out.println("Null Integer: " + emptyValue);
    }*/
}