package com.yao.leetcode.nS26RemoveDuplicatesfromSortedArray;

import java.util.Arrays;
/**
 * 共用時30分
 * 
 * 
 *
 * 
 */
public class N26 {
	public static int removeDuplicates(int[] nums) {
		for (int i : nums) {

			System.out.print(i+",");
		}
		System.out.println();
		int temp = 0;
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] != nums[i + 1]) {
				nums[count] = nums[i + 1];

				count++;
			}
		}
		for (int i : nums) {

			System.out.print(i+",");
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates(nums);
	}
}

/*
 * 因為沒有要額外創，所以創一個int temp存元素 遇到不一樣的就從頭開始存 怎麼刪除元素
 * 
 */
