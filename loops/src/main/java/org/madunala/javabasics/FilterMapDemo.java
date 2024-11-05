package org.madunala.javabasics;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapDemo {

    public static void main(String[] args) {
        Map<String, BigDecimal> companyMap = new HashMap<String, BigDecimal>();
        companyMap.put("apple", new BigDecimal(789654221.25));
        companyMap.put("microsoft", new BigDecimal(478525986.45));
        companyMap.put("facebook", new BigDecimal(87458236.25));
        companyMap.put("google", new BigDecimal(96582365.25));

        Map<String, BigDecimal> myMap = companyMap.entrySet().stream()
                .filter(entry->(entry.getValue().compareTo(new BigDecimal(789654221.25)))>=0)
                .collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));

        System.out.println(myMap);
    }
}
