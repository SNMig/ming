package com.javabase.week1day002;

import java.util.Scanner;

public class Job3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生的数量");
        int num=input.nextInt();
        int[] scors=new int[num];
        int buJiGe=0;
        for(int i=0;i<scors.length;i++){
            System.out.println("请输入第"+(i+1)+"个分数");
            scors[i]=input.nextInt();
        }
        for(int n:scors){
            if(n<60){
                buJiGe++;
                System.out.println("其中不及格的是"+n);
            }
        }
        System.out.println("共有"+buJiGe+"人不及格");
    }
}
