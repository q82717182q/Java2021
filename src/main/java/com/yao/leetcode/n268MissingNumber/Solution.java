package com.yao.leetcode.n268MissingNumber;
/*
 * 這也是成雙成對出現的概念所以一樣用xor
 * 0^別人=別人
 * 自己^自己 = 0
 * 自己^別人 = 別人
 * 串起來規律就是奇數次會顯示沒成對的
 * 共用時20分
 * QQ為啥for判斷是不能直接，因為矩陣只有length個啊但是for回圈是0開始
 * 
 *注意上下限就好
 * 
 * 
 * 
 * */
public class Solution {
    public int missingNumber(int[] nums) {
      	int result = 0;
    	for (int i = 1; i <= nums.length; i++) {
			result ^= i^nums[i-1];
		}
    	return result;
    }
}


/*
 * 範圍就是0~size，沒有出現在這範圍的數字就回傳
 * 
 * 
 * */
