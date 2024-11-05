package org.madunala.ObjArrays1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author nareshmadunala
 */
public class SortObjectsByProperty {

    public static void main(String[] args) {

        Student s1 = new Student("naresh", "karnataka", "IT");
        Student s5 = new Student("karthik", "kerala", "marketing");
        Student s2 = new Student("Ramesh", "hyderabad", "sales");
        Student s3 = new Student("Kumar", "mumbai", "IT");
        Student s4 = new Student("Arun", "london", "IT");
        Student s6 = new Student("anand", "kerala", "marketing");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        students.stream()
                .filter(student -> student.getCity().startsWith("k"))
                .sorted(Comparator.comparing(Student::getName))
                .sorted(Comparator.comparing(Student::getDepartment))
        .forEach(System.out::println);
    }
}

