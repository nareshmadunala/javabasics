package org.madunala.javabasics;

import java.util.List;

public class TextToUppercase {

    public static void main(String[] args) {
        List<String> strList = List.of("Naresh", "kumar", "madunala");
        strList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
