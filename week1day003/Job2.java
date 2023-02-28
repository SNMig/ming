package com.javabase.week1day003;


public class Job2 {
    public static void main(String[] args) {

        int[] nums1={1,34,54,2,467,54,3,344};
        int[] nums2={1,334,54,4,3,65,43,573,334};
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
//        if(nums1.equals(nums2)){
//            System.out.println("两个数组相等");
//        }else {
//            System.out.println("两个数组不等");
//        }
    }
}
