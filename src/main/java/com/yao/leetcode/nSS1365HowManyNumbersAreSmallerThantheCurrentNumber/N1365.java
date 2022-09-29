package com.yao.leetcode.nSS1365HowManyNumbersAreSmallerThantheCurrentNumber;
//共用時六分鐘
public class N1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	int[] result = new int[nums.length];
    	for (int i = 0; i < result.length; i++) {
    		int temp = 0;
			for (int j = 0; j < result.length; j++) {
				//跳過跟自己比
				if (j==i) {
					continue;
				}
				if (nums[i]>nums[j]) {
					temp++;
				}
			}
			result[i]=temp;
		}
		return result;
    }
}
