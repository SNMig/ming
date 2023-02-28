package com.javabase.week1day005;

import java.util.Scanner;

//键盘上依次输入10个正整数，按照升序
public class Job4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int[] c = new int[10];
        for (int i = 1; i < 10; i++) {

            System.out.println("请输入第" + i + "个数");
            c[i] = scanner.nextInt();
            nums=paiXu(c);
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

    static int[] paiXu(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                //{3,23,56,45,32,12,37,67}
                if (a[i] > a[j + 1]) {
                    temp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }


}
