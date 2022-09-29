package com.yao.leetcode.n1480RunningSumof1dArray;
/*
 * 共用時16分
 */
public class Solution {
    public int[] runningSum(int[] nums) {
    	int[] arrSum = new int[nums.length];
    	int sum = 0;
    	for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			arrSum[i] = sum;
		}
		return arrSum;
    }
}
