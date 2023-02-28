package com.javabase.week1day004;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        /*键盘输入成绩直到-1时终止，并输出平均值*/
        double total=0;
        double avrScores=0;
        int i = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入成绩");
            double score = scanner.nextDouble();
            i++;
            if (score == -1) {
                break;
            }
            total += score;
        }
        if (i==1){
            System.out.println("输入无效");
        }
        avrScores = total / (i-1);
        System.out.println(avrScores);
    }
}
