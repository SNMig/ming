package com.javabase.week2day007;

import java.util.*;

/*
找出List<Integer>中重复的元素及出现的次数
 */
public class HomeWork2 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        Map<Integer,Integer> nums=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        num.add(12);
        num.add(13);
        num.add(12);
        num.add(24);
        num.add(25);
        num.add(19);
        num.add(12);

        for (int i = 0; i < num.size(); i++) {
            if (nums.containsKey(num.get(i))){
                nums.put(num.get(i),num.get(i)+1 );
            }else {
                nums.put(num.get(i),1 );
            }

        }
        for (Map.Entry<Integer,Integer> entry: nums.entrySet()) {
            System.out.println(entry.getKey()+","+ entry.getValue());
        }
    }
}
