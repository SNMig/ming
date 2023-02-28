package com.javabase.week3day001;

import java.util.*;

// 测试方法中奖若干用户实例存储到List中，实现:
//        使用打擂台的方式找出最大的用户
//        进行排序
public class User1Tesst {
    public static void main(String[] args) {
        List<User1> user1List=new ArrayList<>();
        user1List.add(new User1("张三",23));
        user1List.add(new User1("李四",21));
        user1List.add(new User1("王悟空",23));
        user1List.add(new User1("王五",34));
        //User1 max= new User1();
        User1 max=user1List.get(0);
        for (int i = 1; i < user1List.size(); i++) {
            if (user1List.get(i).compareTo(max)>0){
                max=user1List.get(i);
            }
        }
        System.out.println("最大的是"+max.getName()+",年龄是"+max.getAge());

        //排序
        for (int i = 0; i < user1List.size()-1; i++) {
            for (int j = 0; j < user1List.size() - i - 1; j++) {
                if (user1List.get(j).compareTo(user1List.get(j + 1)) >0) {
                    User1 temp = user1List.get(j);
                    user1List.set(j, user1List.get(j + 1));
                    user1List.set(j + 1, temp);
                }
            }
        }

        user1List.forEach(n-> System.out.println(n.getName()+n.getAge()));

        //        使用Collections.max方法及sort方法完成求最大用户及排序
        Collections.max(user1List, (o1, o2) -> 0);
    }
}
