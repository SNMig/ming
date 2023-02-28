package com.javabase.week1day002;

import java.util.Scanner;

public class Job5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组个数");
        int num=input.nextInt();
        int[] numbers=new int[num];
        for(int i=0;i< numbers.length;i++){
            System.out.println("请输入第"+(i+1)+"的数字");
            numbers[i]=input.nextInt();
        }
        int ouShu=0;
        int jiShu=0;
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]%2==0){
                ouShu++;
            }else {
                jiShu++;
            }
        }
        System.out.println("该数组中偶数数量与奇数数量只差为"+(ouShu-jiShu));
    }
}
