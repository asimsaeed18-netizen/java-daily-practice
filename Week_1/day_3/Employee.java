
package com.example.week_1.day_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Employee {

   record EmployeeRecord(String name, double salary) {}

   public static void main(String[] args) {

      List<EmployeeRecord> employees = new ArrayList<>();

      employees.add(new EmployeeRecord("Asim", 100000));
      employees.add(new EmployeeRecord("Ali", 10000));
      employees.add(new EmployeeRecord("Ahmad", 50000));

      employees.sort(
              Comparator.comparing(EmployeeRecord::salary)
                      .thenComparing(EmployeeRecord::name)
      );

      for (EmployeeRecord employee : employees) {
         System.out.println(
                 employee.name() + ", salary = " + employee.salary()
         );
      }
   }
}