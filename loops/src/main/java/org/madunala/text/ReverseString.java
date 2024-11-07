package org.madunala.text;

import java.util.stream.IntStream;

/**
 * @author nareshmadunala
 */
public class ReverseString {

    public static void main(String[] args) {

        String name = "Naresh";
        char[] nameChars = name.toCharArray();

        System.out.println(nameChars.length);

        StringBuilder sb = new StringBuilder(name);
        String reversedName = sb.reverse().toString();
        System.out.println(reversedName);

        IntStream.range(0, nameChars.length)
                .mapToObj(i->nameChars[(nameChars.length-1)-i])
                .forEach(System.out::println);
    }

}
