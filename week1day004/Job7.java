package com.javabase.week1day004;

public class Job7 {
    public static void main(String[] args) {
        int[] nums={53,23,46,64,3,2,45,};
        int temp;
        for (int i=0;i< nums.length-1;i++){
            for (int j=0;j< nums.length-1-i;j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
