package org.madunala.javabasics.glider;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AverageSmoother {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 1, 1, 1, 2, 1, 1);
        int k = 3;

        System.out.println(smoothData(nums, k));

        List<Integer> nums2 = List.of(2,3,4,5,1,2,3,1,3);
        int k2 = 5;

        System.out.println(smoothData(nums2, k2));

    }


   private static List<String> smoothData(List<Integer> nums, int k){

        List<String> smoothedData = new ArrayList<>();

        if(k <=0 || k>nums.size()){
            smoothedData.add("-1.00");
            return smoothedData;
        }

        for( int i =0; i<=nums.size()-k; i++){
            int sum = 0;

            for(int j=i; j<i+k; j++){
                sum += nums.get(j);
            }

            double average = (double) sum /k;
            DecimalFormat df = new DecimalFormat("0.00");

            smoothedData.add(df.format(average));
        }

        return smoothedData;
    }
}
