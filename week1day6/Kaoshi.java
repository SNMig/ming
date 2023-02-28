package com.javabase.week1day6;
/*
1、编写方法判断 3 个整数是否能构成一个三角形的边长。
2、 编写方法计算两个整型数组中所有数据之和。
        示例：{1,4,6}，{2,3}，计算结果是 16
3，编写方法获取两个字符串数组中都存在的元素的数量。
        示例：{"ab","cd","ef","gh"}、{"cd","gh","ij"}，返回结果是 2
 **/

public class Kaoshi {
    public static void main(String[] args) {

    }

    //判断三个数能否构成三角形
    static boolean Ifsan(int num1, int num2, int num3) {
        if (num1+num2>num3&&num1+num3>num2&&num2+num3>num1&&num1-num2<num3&&num1-num3<num2&&num2-num3<num1){
            return true;
        }else
            return false;
    }



    //2、 编写方法计算两个整型数组中所有数据之和。
    //        示例：{1,4,6}，{2,3}，计算结果是 16
    static int add(int[] num1, int[] num2) {
        int numTotal = 0;
        if (num1.length > num2.length) {
            for (int i = 0; i < num2.length; i++) {
                numTotal += num1[i] + num2[i];
            }
            for (int j = num2.length; j < num1.length; j++) {
                numTotal += num1[j];
            }
        } else if (num1.length < num2.length) {
            for (int i = 0; i < num1.length; i++) {
                numTotal += num1[i] + num2[i];
            }
            for (int j = num1.length; j < num2.length; j++) {
                numTotal += num1[j];
            }
        } else {
            for (int i = 0; i < num1.length; i++) {
                numTotal += num1[i] + num2[i];
            }
        }
        return numTotal;
    }

    //编写方法获取两个字符串数组中都存在的元素的数量。
    //示例：{"ab","cd","ef","gh"}、{"cd","gh","ij"}，返回结果是 2
    static int num(String[] str1, String[] str2) {
        int num = 0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str2[j].equals(str1[i])) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }
}
