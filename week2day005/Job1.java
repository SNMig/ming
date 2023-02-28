package com.javabase.week2day005;

import java.util.HashMap;
import java.util.Map;

public class Job1 {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王麻子");
        map.put("4","老谭");
        for (String key: map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
        for (String value1: map.values()){
            System.out.println(value1);
        }
        for (Map.Entry<String,String> entry1: map.entrySet()){
            System.out.println(entry1.getKey()+"="+entry1.getValue());
        }

    }
}
