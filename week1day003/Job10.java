package com.javabase.week1day003;

import java.util.Scanner;

public class Job10 {
    public static void main(String[] args) {
        //5、将数组倒置
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组个数");
        int num=input.nextInt();
        int[] nums=new int [num];
        for(int i=0;i<nums.length;i++){
            System.out.println("请输入第"+(i+1)+"一个数字");
            nums[i]=input.nextInt();
        }
        int temp;
        for(int i=0;i< nums.length/2;i++){
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
