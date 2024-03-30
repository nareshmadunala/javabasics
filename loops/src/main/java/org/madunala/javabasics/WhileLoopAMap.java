package org.madunala.javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author nareshmadunala
 */
public class WhileLoopAMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(4, "naresh");
        map.put(6, "Kumar");
        map.put(8, "John");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+"    "+ entry.getValue());
        }
    }
}
