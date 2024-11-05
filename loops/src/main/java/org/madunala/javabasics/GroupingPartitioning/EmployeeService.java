package org.madunala.javabasics.GroupingPartitioning;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public static List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("Sudha", 45, "Delhi", 'F', "Sales", "sudha@email.com", 6400));
        empList.add(new Employee("Naresh", 39, "Phoenix", 'M', "IT", "naresh@email.com", 5000));
        empList.add(new Employee("Arya", 43, "Phoenix", 'F', "IT", "arya@email.com", 5800));
        empList.add(new Employee("Ravi", 45, "Phoenix", 'M', "Sales", "ravi@email.com", 8000));
        empList.add(new Employee("Kumar", 32, "Delhi", 'M', "IT", "kumar@email.com", 6000));
        empList.add(new Employee("Rani", 50, "San Diego", 'F', "Marketing", "rani@email.com", 4500));
        empList.add(new Employee("John", 28, "San Diego", 'M', "HR", "john@email.com", 7000));
        empList.add(new Employee("Sam", 55, "Phoenix", 'M', "Sales", "sam@email.com", 5500));
        empList.add(new Employee("Nancy", 31, "Phoenix", 'F', "IT", "nancy@email.com", 8100));
        empList.add(new Employee("Mouni", 32, "Phoenix", 'F', "Marketing", "mouni@email.com", 9100));

        return empList;
    }
}
