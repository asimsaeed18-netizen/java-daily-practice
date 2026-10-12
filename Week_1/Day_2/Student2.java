//day2 exercise 8
package com.example.week_1.day_2;

import java.util.Objects;

public class Student2 {
    private int id;
    private String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Student2 other = (Student2) obj;

        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // Main method to test the class
    public static void main(String[] args) {

        Student2 s1 = new Student2(101, "Ali");
        Student2 s2 = new Student2(101, "Ali");
        Student2 s3 = new Student2(102, "Ahmed");

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        System.out.println("Are s1 and s2 equal? " + s1.equals(s2));
        System.out.println("Are s1 and s3 equal? " + s1.equals(s3));

        System.out.println("Hash code of s1: " + s1.hashCode());
        System.out.println("Hash code of s2: " + s2.hashCode());

        System.out.println(
                "Do s1 and s2 have the same hash code? "
                        + (s1.hashCode() == s2.hashCode())
        );
    }
}
