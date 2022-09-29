package com.yao.leetcode.nS217ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;




//自己想的感覺跟前面學的用法挺像的
//不過用hashmap效能感覺沒很好
//但是用網路上找的也沒效能多好ＸＤ
//共用時24分

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    	Map<Integer, Integer> m = new HashMap<Integer, Integer>(); 
    	for (int i = 0; i < nums.length; i++) {
    		if (m.containsKey(nums[i])) {
    			return true;
    		}else {
    			m.put(nums[i], 1);
			}
		}
    	
    	
    	return false;
    }
}


/*
 * 一樣用hashmap對應的數字當作key用value去計算次數
 * value沒有小於等於1則return true
 * 
 * */

