package com.javabase.week1day003;

import java.util.Scanner;

public class Job8 {
    public static void main(String[] args) {
        //1、从键盘输入一个3位数的整数，判断其是否是7的倍数或带有数字7
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个三位数的整数：");
        String num=scanner.next();
        int nums=Integer.parseInt(num);
        if (nums<100||nums>1000){
            System.out.println("输错了");
        } else  {
            if(nums%7==0||num.contains("7")){
                System.out.println(num+"是满足条件");
            }else {
                System.out.println("不满足");
            }
        }

    }
}
