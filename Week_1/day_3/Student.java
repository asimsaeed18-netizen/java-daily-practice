//day3 exercise 5
package com.example.week_1.day_3;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Student {
    record StudentRecord(String name, String grade){}

    public static void main(String[] args){
        List<StudentRecord> students = new ArrayList<>();
        students.add(new StudentRecord("Asim", "A"));
        students.add(new StudentRecord("Ali", "B"));
        students.add(new StudentRecord("Ahmad", "A"));
        students.add(new StudentRecord("Umar", "B"));
        students.add(new StudentRecord("Abdullah", "A"));

        HashMap<String, List<StudentRecord>> groupedStudents = new HashMap<>();

        for (StudentRecord student : students){

            groupedStudents
                    .computeIfAbsent(student.grade(), grade -> new ArrayList<>())
                    .add(student);
        }

        for (String grade : groupedStudents.keySet()){
            System.out.println("Grade " + grade + ": " + groupedStudents.get(grade));
        }
    }

}
