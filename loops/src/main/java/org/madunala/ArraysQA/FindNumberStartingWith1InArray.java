package org.madunala.ArraysQA;

import java.util.Arrays;

/**
 * @author nareshmadunala
 */
public class FindNumberStartingWith1InArray {

    public static void main(String[] args) {
        // WAP to find the number starting with 1 in an Array
        // Array:
        int[] number ={9,11,2,8,21,1};
        // output will be : 11,1
        Arrays.stream(number).filter(num-> Integer.toString(num).startsWith("1"))
                .forEach(System.out::println);
    }
}
