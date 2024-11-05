package org.madunala.javabasics;

import java.util.List;
import java.util.stream.Collectors;

public class AverageOfIntegers {

    public static void main(String[] args) {
       List<Integer> intList =  List.of(3, 5, 7, 12, 67, 4, 66);
       double average = intList.stream().mapToDouble(Integer::doubleValue)
               .average()
               .orElse(0.0);

        System.out.printf("%.2f%n", average);
    }
}
