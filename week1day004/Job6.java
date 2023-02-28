package com.javabase.week1day004;

import java.util.Scanner;

public class Job6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*num-1-2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
