package com.javabase.week3day002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job1 {
    public static void main(String[] args) throws Exception {

        List<Integer> list1 = Arrays.asList(12, 14, 13, 15, 17, 34, 23);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        List<Integer> list3 = new ArrayList<>();
        Job1 job1 = new Job1();

        list3 = job1.divide(list1, list2);
        list3.forEach(System.out::println);

    }


    public List divide(List a, List b) throws Exception {
        List c = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            try {
                if (b.get(i) == (Integer) 0) {


                }
            } catch (Exception e) {
                e.fillInStackTrace();
            }
            c.set(i, (Integer) a.get(i) / (Integer) b.get(i));


        }
        return c;
    }
}
