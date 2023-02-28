package com.javabase.week1day003;

import java.util.Scanner;

public class Job7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入姓名个数");
        int nums=input.nextInt();

        String[] names=new String[nums];
        for (int i=0;i<names.length;i++){
            System.out.println("请输入名字");
            names[i]=input.next();
        }
        System.out.println("请输入要查询的名字");
        String a=input.next();
        for (int i=0;i<names.length;i++){
            if(names[i].equals(a)){
                System.out.println(i+1);
            }
        }

    }
}
