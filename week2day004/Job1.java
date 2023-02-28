package com.javabase.week2day004;

import java.util.ArrayList;
import java.util.List;

public class Job1 {
    public static void main(String[] args) {

        
        List<String> s= new ArrayList<>();
        s.add("张三");
        s.add("李四");
        s.add("李爽");
        s.add("王五");
        s.add("李强");
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).startsWith("李")){
                s.remove(i);
                i--;
            }
        }for (int j=0;j< s.size();j++){
            System.out.println(s.get(j));
        }
    }
}
