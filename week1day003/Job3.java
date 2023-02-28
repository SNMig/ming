package com.javabase.week1day003;

import java.util.Scanner;

public class Job3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组num1个数");
        int num1=input.nextInt();
        int[] nums1=new int [num1];
        for(int i=0;i<nums1.length;i++){
            System.out.println("请输入第"+(i+1)+"一个数字");
            nums1[i]=input.nextInt();
        }
        System.out.println("请输入数组num2个数");
        int num2=input.nextInt();
        int[] nums2=new int [num2];
        for(int i=0;i<nums2.length;i++){
            System.out.println("请输入第"+(i+1)+"一个数字");
            nums2[i]=input.nextInt();
        }
        boolean a=true;
        if (nums1.length!=nums2.length) {
            a=false;
        }else {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i]!=nums2[i]){
                    a=false;
                    break;
                }
            }
        }
        if (a){
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }
    }
}
