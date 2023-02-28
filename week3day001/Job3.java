package com.javabase.week3day001;

import java.util.*;
import java.util.stream.Collectors;

public class Job3 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,78,9);
        List<Integer> result=nums.stream()
                .filter(num->num%2==0)
                .map(num->num*2)
                .collect(Collectors.toList());
        //System.out.println(result);
        nums.forEach(num-> System.out.println(num));

        Map<String,String> map=new HashMap<>();
        map.put("sfsdf","dsfs");
        map.put("123","dsfsdf");
        map.put("456","dfgdf");
        map.forEach((n1,n2)->
        System.out.println( n2));
    }
}
