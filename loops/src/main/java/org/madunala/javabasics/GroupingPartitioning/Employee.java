package org.madunala.javabasics.GroupingPartitioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {

    private String name;
    private Integer age;
    private String city;
    private Character gender;
    private String department;
    private String email;
    private Integer salary;


}
