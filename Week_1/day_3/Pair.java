//day 3 exercise 7
package com.example.week_1.day_3;

public class Pair<A,B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public static Pair<String, Integer> getStudentDetails() {
        return new Pair<>("Ali", 24);
    }

    public static void main(String[] args){
        Pair<String, Integer> student = new Pair<>("Asim" , 22);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());

        Pair<String, Integer> details = getStudentDetails();
        System.out.println(details.getFirst());
        System.out.println(details.getSecond());
    }
}
