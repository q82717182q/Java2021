package com.yao.leetcode.nS1470ShuffletheArray;

public class N1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length/2; i++) {
			result[2*i]=nums[i];
			result[2*i+1]=nums[i+n];
			System.out.printf("i:%d ",i);
		}
        return result;
    }
    public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		shuffle(nums, n);
	}
}
