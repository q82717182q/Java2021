package com.yao.leetcode.nSS1389CreateTargetArrayintheGivenOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//第一次作用integer其實可以不用，省掉他直接用int[]
public class N1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
    	//list適合解這題
    	List<Integer> list = new ArrayList<Integer>();
//    	Integer[] result = new Integer[nums.length];
    	int[] resultInt = new int[nums.length];
//對應index[]插入nums[]
    	for (int i = 0; i < nums.length; i++) {
    		list.add(index[i],nums[i]);
		}
//    	list.toArray(result);
//    	for (int i = 0; i < nums.length; i++) {
//			resultInt[i] = result[i];
//		}
    	for (int i = 0; i < nums.length; i++) {
			resultInt[i] = list.get(i);
		}
		return resultInt ;
        
    }
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,0};
    	 int[] index = {0,1,2,3,0};
    	 createTargetArray(nums, index);
	}
}
/*
 * 
 * 索引i元素插入target索引index中，若已有值，則其他往後推
 * */
