package com.javabase.week1day002;

import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生的数量");
        int num=input.nextInt();
        int[] scors=new int[num];
        double res=0;
        for(int i=0;i<scors.length;i++){
            System.out.println("请输入第"+(i+1)+"个分数");
            scors[i]=input.nextInt();
        }
        for(int n:scors){
            System.out.println(n);
            res+=n;
        }
        System.out.println("总分是"+res);
        System.out.println("平均分："+res/num);
    }
}
