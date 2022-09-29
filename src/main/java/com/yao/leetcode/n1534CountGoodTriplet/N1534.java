package com.yao.leetcode.n1534CountGoodTriplet;
//共用時九分鐘，幾乎不用想按照題目條件打就好
public class N1534 {
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int result= 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k=j+1; k < arr.length; k++) {
					if (Math.abs(arr[i]-arr[j])<=a) {
						if (Math.abs(arr[j]-arr[k])<=b) {
							if (Math.abs(arr[i]-arr[k])<=c) {
								result++;
							}	
						}
					}
				}
			}
		}
		return result;
	}
}
