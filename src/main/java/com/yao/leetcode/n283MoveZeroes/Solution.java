package com.yao.leetcode.n283MoveZeroes;

//共用時37分
//把有數字的通通塞到前面，跳過零
//走訪完之後index所在差距就是要填滿幾個零

public class Solution {
    public void moveZeroes(int[] nums) {
    	int index =0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				nums[index++] = nums[i];
			}
		}
    	for (int i = index; i < nums.length; i++) {
			nums[i]=0;
		}
    }
}

/*
 * 從陣列尾巴開始檢查
 * 創一個temp用交換的跟判斷後最後面不是零的交換
 * return結果
 */