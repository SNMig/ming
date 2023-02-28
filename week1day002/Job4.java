package com.javabase.week1day002;

import java.util.Scanner;

public class Job4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num=input.nextInt();
        int[] scorcs=new int[num];
        for(int i=0;i< scorcs.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的分数");
            scorcs[i]=input.nextInt();
        }
        for(int n:scorcs){
            System.out.println(n);
        }
        int maxScorcs=scorcs[0];
        for(int i=0;i<scorcs.length;i++){
            if(scorcs[i]>maxScorcs){
                maxScorcs=scorcs[i];
            }else {
                maxScorcs=scorcs[0];
            }
        }
        System.out.println("所有学生中分数最高的是"+maxScorcs);
    }
}
