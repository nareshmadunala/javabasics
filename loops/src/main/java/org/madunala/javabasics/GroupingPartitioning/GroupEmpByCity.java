package org.madunala.javabasics.GroupingPartitioning;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEmpByCity {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeService.getAllEmployees();

        // print all departments
        //empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //System.out.println(empList.stream().map(Employee::getDepartment).distinct().count());

        // highest paid employee
       // System.out.println(empList.stream().max(Comparator.comparing(Employee::getSalary)));
        Map<String, List<String>> empMapByCity = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.mapping(Employee::getName, Collectors.toList())));
        // System.out.println(empMapByCity);
        // {Delhi=[Sudha, Kumar], San Diego=[Rani, John], Phoenix=[Naresh, Arya, Ravi, Sam, Nancy, Mouni]}

        Map<String, Long> empMapByCityCount = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));

        // System.out.println(empMapByCityCount);
        // {Delhi=2, San Diego=2, Phoenix=6}

        Map<Character, Double> empMapByGenderAvgAge = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        // System.out.println(empMapByGenderAvgAge);
        // {F=40.2, M=39.8}

        Map<Character, Optional<Employee>> empMapByGenderMaxSalary = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

       // System.out.println(empMapByGenderMaxSalary);
        // {F=Optional[Employee(name=Mouni, age=32, city=Phoenix, gender=F, department=Marketing, email=mouni@email.com, salary=9100)],
        // M=Optional[Employee(name=Ravi, age=45, city=Phoenix, gender=M, department=Sales, email=ravi@email.com, salary=8000)]}

        Map<Character, Employee> empMapByGenderMaxSalary2 = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));

        //System.out.println(empMapByGenderMaxSalary2);
        //{F=Employee(name=Mouni, age=32, city=Phoenix, gender=F, department=Marketing, email=mouni@email.com, salary=9100),
        // M=Employee(name=Ravi, age=45, city=Phoenix, gender=M, department=Sales, email=ravi@email.com, salary=8000)}

        Map<Character, Employee> empMapByGenderMaxSalary3 = empList.stream()
                .collect(Collectors.toMap(Employee::getGender, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));

        //System.out.println(empMapByGenderMaxSalary3);
        //{F=Employee(name=Mouni, age=32, city=Phoenix, gender=F, department=Marketing, email=mouni@email.com, salary=9100),
        // M=Employee(name=Ravi, age=45, city=Phoenix, gender=M, department=Sales, email=ravi@email.com, salary=8000)}

        Map<Boolean, List<Employee>> empMapBySalaryMore = empList.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>5000));

        //System.out.println(empMapBySalaryMore);

        // {false=[Employee(name=Naresh, age=39, city=Phoenix, gender=M, department=IT, email=naresh@email.com, salary=5000),
        // Employee(name=Rani, age=50, city=San Diego, gender=F, department=Marketing, email=rani@email.com, salary=4500)],
        // true=[Employee(name=Sudha, age=45, city=Delhi, gender=F, department=Sales, email=sudha@email.com, salary=6400),
        // Employee(name=Arya, age=43, city=Phoenix, gender=F, department=IT, email=arya@email.com, salary=5800),
        // Employee(name=Ravi, age=45, city=Phoenix, gender=M, department=Sales, email=ravi@email.com, salary=8000),
        // Employee(name=Kumar, age=32, city=Delhi, gender=M, department=IT, email=kumar@email.com, salary=6000),
        // Employee(name=John, age=28, city=San Diego, gender=M, department=HR, email=john@email.com, salary=7000),
        // Employee(name=Sam, age=55, city=Phoenix, gender=M, department=Sales, email=sam@email.com, salary=5500),
        // Employee(name=Nancy, age=31, city=Phoenix, gender=F, department=IT, email=nancy@email.com, salary=8100),
        // Employee(name=Mouni, age=32, city=Phoenix, gender=F, department=Marketing, email=mouni@email.com, salary=9100)]}
    }
}
