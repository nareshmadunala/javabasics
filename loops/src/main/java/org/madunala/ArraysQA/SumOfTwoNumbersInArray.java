package org.madunala.ArraysQA;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nareshmadunala
 */
public class SumOfTwoNumbersInArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 7;
        int firstIndex = 0;
        int secondIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])) {
                firstIndex = map.get(nums[i]);
                secondIndex = i;
            }else{
                map.put(target - nums[i], i);
            }
        }
        System.out.println(firstIndex+ "   " +secondIndex);
    }
}
