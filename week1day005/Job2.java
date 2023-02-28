package com.javabase.week1day005;
//计算一个整数数组中，奇数的数量与偶数数量之差


import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        int[] nums={1,2,34,35,3,4,3,5,77,6,5,44,556};
        int n=number(nums);
        System.out.println(n);
    }

    static int number(int[] num) {
        int a = 0;
        int b = 0;
        for (int n : num) {

            if (n / 2 == 1) {
                a++;
            } else {
                b++;
            }
        }
        return (a - b)<0?b-a:a-b;
    }
}
