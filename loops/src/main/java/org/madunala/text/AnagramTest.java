package org.madunala.text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nareshmadunala
 */
public class AnagramTest {

    public static void main(String[] args) {
        String str1 = "Naresh";
        String str2 = "shaNrw";

        Map<Character, Integer> frequency = new HashMap<>();

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        for( char ch1 : str1Chars){
            if(frequency.containsKey(ch1)){
                frequency.put(ch1, frequency.get(ch1).intValue()+1);
            }else{
                frequency.put(ch1, 1);
            }
        }

        for( char ch2 : str2Chars){
            if(frequency.containsKey(ch2)){
                frequency.put(ch2, frequency.get(ch2).intValue()-1);
            }else{
                frequency.put(ch2, 1);
            }
        }

        boolean isAnagram = true;
        for(Character ch:frequency.keySet()){
            if(frequency.get(ch).intValue()>0){
                isAnagram = false;
            }
        }

        if(isAnagram){
            System.out.println(" Given Strings are Anagrams");
        }else{
            System.out.println(" Given Strings are not Anagrams");
        }



    }
}
