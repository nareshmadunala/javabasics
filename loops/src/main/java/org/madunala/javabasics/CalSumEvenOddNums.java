package org.madunala.javabasics;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalSumEvenOddNums {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 5,4, 6, 7, 8, 9);
        Integer sumOfEven = nums.stream().filter(i->(i%2==0)).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEven);
         Map<String, Integer> myMap = nums.stream()
                .collect(Collectors.groupingBy(num->num%2==0?"Even":"Odd", Collectors.summingInt(Integer::intValue)));
        System.out.println(myMap);
    }
}
