package com.yao.leetcode.n350IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 這邊最後回傳Arrays.copyOfRange(ret, 0, index)
 * 是因為一開始ret矩陣就取兩者長度最小值，
 * 又因為重複的數組不一定能填滿ret所以要另外用一個index變數
 * 確定要回傳的數量，當要回傳時index的索引可能為零或是超出ret的矩陣範圍
 * 所以用Arrays.copyOfRange(ret, 0, index)取0~index-1剛好
 * 共用時40分
 * */

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	int length1 = nums1.length;
    	int length2 = nums2.length;
    	int index = 0;
    	int[] ret = new int[Math.min(length1, length2)];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < length1; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i])+1);
			}else {
				map.put(nums1[i], 1);
			}
		}
		for (int i = 0; i < length2; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i])!=0) {
				map.put(nums2[i], map.get(nums2[i])-1);
				ret[index++] = nums2[i];
			}
		}
    	return Arrays.copyOfRange(ret, 0, index);
        
    }
	
}

/*
 * 反正就是把重複地列出來 順序怎樣都無所謂
 * 用hashmap 將第一組對應存入
 * 然後再用第二組去減，有對應到的就累加到準備回傳的參數
 * 
 * 
 * */
