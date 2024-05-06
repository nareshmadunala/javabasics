package org.madunala.ArraysQA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


/**
 * @author nareshmadunala
 */
public class ReversSortArrayUsingSteam {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 18, 6, 1, 13};

        Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
