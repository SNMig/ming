package com.javabase.week1day005;
//计算两个整型数组之和
public class Job3 {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6};
        int[] b1={1,2,3,4,5,6,7,8};
        int[] c1=nums(a1,b1);
        for (int i : c1) {
            System.out.println(i);
        }

    }
    static int[] nums(int[]num1,int[]num2){

        int[]newnum=new int[(num1.length-num2.length)>0?num1.length:num2.length];
        if (num1.length>num2.length){

            for (int i=0;i<num2.length;i++){
                newnum[i]=num1[i]+num2[i];
            }
            for (int j=num2.length;j<num1.length;j++){
                newnum[j]=num1[j];
            }
        }else if (num1.length<num2.length){
            for (int i = 0; i < num1.length; i++) {
                newnum[i] = num1[i] + num2[i];
            }
            for (int j = num1.length; j < num2.length; j++) {
                newnum[j] = num2[j];
            }
        }else {
            for (int i = 0; i < num1.length; i++){
                newnum[i] = num1[i] + num2[i];
            }
        }
        return newnum;
    }
}
