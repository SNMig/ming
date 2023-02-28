package com.javabase.week2day004;

import java.util.ArrayList;
import java.util.List;

public class Job3Test {
    public static void main(String[] args) {

        Job3 j3=new Job3();
        List<String> lists=new ArrayList<>();
        lists.add("ssssss");
        lists.add("sdfsdf");
        lists.add("as");
        lists.add("a");
        lists.add("asqw");
        List<String> S=new ArrayList<>();
        S=j3.sd(lists);

        for (int i = 0; i < S.size(); i++) {
            System.out.println(S.get(i));
        }

    }




}
