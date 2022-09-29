package com.yao.leetcode.n1512NumberofGoodPairs;

public class N1512 {
    public int numIdenticalPairs(int[] nums) {
    	int numGood = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		//j從i+1開始本身就代表i<j這個條件
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					numGood++;
				}
			}
		}
		return numGood;
    }
}
