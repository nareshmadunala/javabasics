package org.madunala.ArraysQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class FindMissingNumbersInArray
{
    public static void main( String[] args )
    {

        // WAP to find two missing number in the given integer array:
        int[] number ={3,2,7,1,4,8};
        // output is 5,6

        int length = number.length;
        Set<Integer> nums = new TreeSet<>();

        for(int i = 0; i<length; i++){
            nums.add(number[i]);
        }

        Iterator<Integer> it = nums.iterator();
        Integer firstNumber = null;
        Integer lastNumber = null;

        while(it.hasNext()){
            if(firstNumber == null){
                firstNumber = it.next();
            }
            lastNumber = it.next();
        }

        ArrayList missingNumbers = new ArrayList();
        for(int j = firstNumber; j<=lastNumber; j++){

            if(!nums.contains(j)){
                missingNumbers.add(j);
            }
        }

        System.out.println(missingNumbers);


    }


}
