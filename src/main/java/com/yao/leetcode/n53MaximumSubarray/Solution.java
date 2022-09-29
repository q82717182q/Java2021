package com.yao.leetcode.n53MaximumSubarray;
/*
 * 直接看解答吧
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
			sum += nums[i];
			if (nums[i]>sum) {
				sum = nums[i];
			}
			if (sum>max) {
				max = sum;
			}
		}
        return max;
    }
}
