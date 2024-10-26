package org.madunala.text;

/**
 * @author nareshmadunala
 */
public class PasswordMatcher {

    public static void main(String[] args) {
        String[] passwords1 = {"Pss61Word", "PAss6wor", "PasS66word"};
        // count of upper case letters, substring of reversed string, sum of digits
        String pattern1 = "2dro12";

        boolean noMatchFound = true;

        for(String password:passwords1){
            if(passwordPatternChecker(password, pattern1)){
                System.out.println(password);
                noMatchFound = false;
            }
        }

        if(noMatchFound){
            System.out.println("No Matching Password Found");
        }
    }

    private static boolean passwordPatternChecker(String password, String pattern){

        int upperCaseLettersCount = countUpperCaseLetters(password);
        String reversedString = reverseString(password);
        int sumOfDigits = calSumOfDigits(password);

        boolean isMatched = pattern.equals((upperCaseLettersCount+reversedString.substring(0,3)+sumOfDigits).toString());
        return isMatched;
    }

    private static int countUpperCaseLetters(String password){
        int count = 0;
        char[] passwordChars = password.toCharArray();
        for(char ch:passwordChars){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        return count;
    }

    private static String reverseString(String password){
        String reversedString = new StringBuffer(password).reverse().toString();
        return reversedString;
    }

    private static int calSumOfDigits(String password){
        int sum = 0;
        char[] passwordChars = password.toCharArray();
        for(char ch:passwordChars){
            if(Character.isDigit(ch)){
                sum=sum+Integer.parseInt(String.valueOf(ch));
            }
        }
        return sum;
    }



}
