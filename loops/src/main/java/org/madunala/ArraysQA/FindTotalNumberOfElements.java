package org.madunala.ArraysQA;
import java.util.Arrays;
public class FindTotalNumberOfElements {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 3, 9, 6, 1};
        System.out.println(Arrays.stream(numbers).sum());
    }
}
