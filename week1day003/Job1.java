package com.javabase.week1day003;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {

        int []nums={1,23,45,35,67,54,3,254,56,768};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入想要查询的数字");
        int serchNum=input.nextInt();
        boolean exist=false;
        for (int num : nums) {
            if(serchNum==num){
                //System.out.println("该数字存在数组中");
                exist=true;
                break;
            }
        }
        if(exist){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }
}
