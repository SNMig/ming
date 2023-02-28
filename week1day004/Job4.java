package com.javabase.week1day004;

import java.util.Scanner;

public class Job4 {
    public static void main(String[] args) {
        //正整数，每个位数字求和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = scanner.nextInt();
        int toatl = 0;
        do {
            toatl += num%10;
            num = num / 10;
        } while (num > 0);
        System.out.println(toatl);

    }
}
