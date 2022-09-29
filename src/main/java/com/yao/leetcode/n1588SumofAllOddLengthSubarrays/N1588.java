package com.yao.leetcode.n1588SumofAllOddLengthSubarrays;
//直接看答案
//先做出一個陣列元素為當前索引以前總和，這樣要求其中連續幾位的和，只要尾減頭就好
//
public class N1588 {
    public static int sumOddLengthSubarrays(int[] arr) {
    	int[] preSum = new int[arr.length+1];
    	int res = 0;
    	for (int i = 0; i < arr.length; i++) {
			preSum[i+1]=preSum[i]+arr[i];
		}
    	for (int i = 1; i <= arr.length; i+=2) {
			for (int j = 0; j+i-1 < arr.length; j++) {
				res +=preSum[j+i]-preSum[j];
			}
		}
    	
    	return res;
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,4,2,5,3};
    	sumOddLengthSubarrays(arr);
	}
}
