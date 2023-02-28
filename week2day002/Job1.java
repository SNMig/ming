package com.javabase.week2day002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Job1 {
    public static void main(String[] args) {
        List<Integer> s= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> result=s.stream()
                .filter(num->num%2==0)
                .map(num->num*2)
                .collect(Collectors.toList());
        Job1 job1=new Job1();
        Consumer<String>c=job1::c;

    }
    public void c(String a){

    }
}
