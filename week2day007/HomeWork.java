package com.javabase.week2day007;

import java.util.*;

/*
1，键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序，
同时找出出现最多的字母。例如输入：adaaabbabcaccdbdd，打印结果为：abcd   出现最多的字母是a，共6次

 */
public class HomeWork {
    public static void main(String[] args) {
        LinkedHashSet<Character> str = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String input = scanner.next();
        //去掉重复的字符
        for (int i = 0; i < input.length(); i++) {
            str.add(input.charAt(i));
        }


        Map<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            int count=characterCount.getOrDefault(c,0)+1;
            characterCount.put(c, count);
        }
        for (Character key:characterCount.keySet()){
            System.out.println(key);
        }
        int maxCount=0;
        char maxChar=' ';
        for (Map.Entry<Character,Integer> entry:characterCount.entrySet()){
            int count= entry.getValue();
            if (count>maxCount){
                maxCount=count;
                maxChar= entry.getKey();
            }
        }
        System.out.println("出现最多的字母是"+maxChar+",出现次数是"+maxCount);
    }

}
