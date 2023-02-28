package com.javabase.week1day002;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        //判断输入一个年份是否是闰年
        while (true) {
            System.out.println("请输入一个年份");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            System.out.println("请输入一个月份");
            int month = scanner.nextInt();
            if (month <= 12 && month >= 1) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    System.out.println(year + "年" + month + "月" + "有31天");
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println(year + "年" + month + "月" + "有30天");
                } else {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println(year + "年" + month + "月" + "有29天");
                    } else {
                        System.out.println(year + "年" + month + "月" + "有28天");
                    }
                }
            } else {
                System.out.println("输错了");
            }
//        if(year%4==0&&year%100!=0||year%400==0){
//            //System.out.println(year+"是闰年");
//            if(month==2){
//                System.out.println(year+"年"+month+"月"+"有29天");
//            } else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
//                System.out.println(year+"年"+month+"月"+"有31天");
//            }else {
//                System.out.println(year+"年"+month+"月"+"有30天");
//            }
//        }else if (month==2){
//            //System.out.println(year+"是平年");
//            System.out.println(year+"年"+month+"月"+"有28天");
//        }else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
//            System.out.println(year+"年"+month+"月"+"有31天");
//        }else {
//            System.out.println(year+"年"+month+"月"+"有30天");
//        }
        }
    }
}
