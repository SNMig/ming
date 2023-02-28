package com.javabase.week2day004;

import java.util.ArrayList;
import java.util.List;

//实现一个方法，接收List<String>,返回其中长度大于2的数据
public class Job3 {
    public List<String> sd(List<String> list){
        List<String> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>2){

                list1.add(list.get(i));

            }
        }
        return list1;

    }
}
