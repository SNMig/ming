package com.javabase.week1day004;

import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("请输入你猜测的数字");
            int guessNum1 = scanner.nextInt();
            i++;
            if (guessNum1 > num) {
                System.out.println("猜大了");
            } else if (guessNum1 < num) {
                System.out.println("猜小了");
            } else if (guessNum1 == num) {
                System.out.println("猜对了,共用了"+i+"次");
                break;
            }
        }
    }
}
