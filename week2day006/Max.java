package com.javabase.week2day006;

import java.util.ArrayList;
import java.util.List;

public class Max {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.random() * 100 + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j++)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }

            }
        }
        System.out.println(list.get(0));
    }
}
