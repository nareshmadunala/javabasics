package org.madunala.text;


/** b bn  bb b njhkjmju
 * @author nareshmadunala
 */
public class StringContainsVowels {

    public static void main(String[] args) {
        String str1 = "naresh";
        String str2 = "qwsdrhtfkb";
        System.out.println(checkForVowels(str1));
        System.out.println(checkForVowels(str2));

    }

    private static boolean checkForVowels(String str1) {
        boolean containsVowels = false;
        containsVowels = str1.toLowerCase().matches(".*[aeiou].*");
        return containsVowels;
    }
}
