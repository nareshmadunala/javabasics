package org.madunala.ObjArrays1;

import java.util.List;

/**
 * @author nareshmadunala
 */
public class AverageOfMaleMembers {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("naresh", "M", 10),
                new Person("Raju", "M", 12),
                new Person("Rani", "F", 20)
        );
        double ave = persons.stream().filter(p->p.getGender().equals("M")).mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(ave);
    }
}
