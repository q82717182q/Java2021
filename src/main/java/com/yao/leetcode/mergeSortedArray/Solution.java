package com.yao.leetcode.mergeSortedArray;

import java.util.Arrays;

/*
 * 88 Merge Sorted Array  
 * 不用想那麼多，其實只要把第二個陣列加到第一個  
 * 然後再用Arrays的方法排列即可
 * 
*/
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i= m; i < m+n; i++) {
			nums1[i] = nums2[index++];
		}
        Arrays.sort(nums1);
    }
}


/*
 * 一個output陣列長度為m+n
 * 放進去output之後用sort排列    
*/
