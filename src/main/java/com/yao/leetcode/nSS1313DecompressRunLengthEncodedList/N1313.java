package com.yao.leetcode.nSS1313DecompressRunLengthEncodedList;

import java.util.ArrayList;
import java.util.Arrays;

//共用時10分鐘
public class N1313 {
    public int[] decompressRLElist(int[] nums) {
    	//計算總共要多長的陣列
    	int sum = 0;
    	for (int i = 0; i < nums.length; i+=2) {
			sum+=nums[i];
		}
    	int[] result = new int[sum];
        int val = 0;
        int freq = 0;
        //計算每次result該新增的位置
        int count = 0;
        //依照每個位置開始替result新增元素
        for (int i = 0; i < nums.length; i+=2) {
			freq = nums[i];
			val = nums[i+1];
			for (int j = 0; j < freq; j++) {
				result[count+j]=val;
			}
			count+=freq;
		}
		return result;
    }
}
