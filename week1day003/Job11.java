package com.javabase.week1day003;

import java.util.Scanner;

public class Job11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数组个数");
        int num=scanner.nextInt();
        int[] nums=new int [num];
        for(int i=0;i<nums.length;i++){
            System.out.println("请输入第"+(i+1)+"一个数字");
            nums[i]=scanner.nextInt();
        }
        int[] newnums=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==1){
                newnums[i/2]=nums[i];
            }else {
                newnums[(nums.length+i)/2]=nums[i];
            }
        }
        for (int newnum : newnums) {
            System.out.print(newnum);
        }
    }
}
