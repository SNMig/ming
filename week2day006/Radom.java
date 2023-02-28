package com.javabase.week2day006;

import java.util.ArrayList;
import java.util.List;

//随机生成 10 个[1,100]之间的整数，中，遍历显示，找出前 3 名最大值，
//删除它们
public class Radom {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //int num=;
            list.add((int) (Math.random() * 100) + 1);
        }
        for (Integer num : list) {
            System.out.println(num);

        }
        System.out.println("----------------");
//        for (int i = 0; i < 3; i++) {
//            int maxIndex = 0;
//            for (int j = 0; j < list.size() - 1; j++) {
//                if (list.get(j) > list.get(maxIndex)) {
//                    maxIndex = j;
//                }
//            }
//            int max = list.remove(maxIndex);
//            System.out.println(max);
//        }
//        System.out.println("--------------------");
//        for (Integer num : list) {
//            System.out.println(num);
//        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j++)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        ////////***********此项输出有误，不能删除最大值，需要重新更改************
        for (int j = 0; j < 3; j++) {
            list.remove(j);
            System.out.println(list.remove(list.get(0)));
        }
        System.out.println("----------------------");
        for (Integer num : list) {
            System.out.println(num);


        }
    }
}
