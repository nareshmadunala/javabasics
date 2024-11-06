package org.madunala.javabasics.glider;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringConcatTest {

    public static void main(String[] args) {
        String str1 = "SAM";
        String str2 = "JOHN";
        String str3 = "SMJOHN";

        System.out.println(solve(str1, str2, str3));
    }

    private static String testMagnetic(String str1, String str2, String str3) {

        char [] str1Chars = str1.toCharArray();
        char [] str2Chars = str2.toCharArray();
        char [] str3Chars = str3.toCharArray();

        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for(char ch : str1Chars){
            if(frequency.containsKey(ch)){
                int i = frequency.get(ch) + 1;
                frequency.put(ch, i);
            }else{
                frequency.put(ch, 1);
            }
        }

        for(char ch : str2Chars){
            if(frequency.containsKey(ch)){
                int i = frequency.get(ch) + 1;
                frequency.put(ch, i);
            }else{
                frequency.put(ch, 1);
            }
        }


        for(char ch : str3Chars){
            if(frequency.containsKey(ch)){
                int i = frequency.get(ch) - 1;
                frequency.put(ch, i);
            }else{
                frequency.put(ch, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> freIt = frequency.entrySet().iterator();
        while (freIt.hasNext()){
            if(freIt.next().getValue()>0){
                return "No";
            }
        }

        return "Yes";


    }

    private static String solve(String s1, String s2, String R) {


        int [] frequency = new int[26];
        for(char c: R.toCharArray()){
            frequency[c-'A']++;
        }
        for(char c: s1.toCharArray()){
            if(frequency[c-'A']>0){
                frequency[c-'A']--;
            }else {
                return "No";
            }
        }
        for(char c: s2.toCharArray()){
            if(frequency[c-'A']>0){
                frequency[c-'A']--;
            }else {
                return "No";
            }
        }

        for(int count : frequency){
            if(count>0){
                return "No";
            }
        }

        return "Yes";
    }
}
