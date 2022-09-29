package com.yao.leetcode.factorialTrailingZeroes;
/*
 * 172 Factorial Trailing Zeroes
 * 雖然是說算幾個5就好，但是要知道最簡單的方式，1到n有幾個可以被五除，
 * 這些可以提供一個五
 * 被25除的可以提供兩個五，但是前一項已經加入sum了，所以這邊再找出可以被5除的有幾個
 * 實際上就是被25除的有幾個，這些數字可以比5的倍數多提供一個5，
 * 所以一樣看似簡單的加上去就好
 * 
 * */
public class Solution {
	public int trailingZeroes(int n) {
		int sum = 0;
		while (n >0) {
			sum+=n/5;
			n/=5;
		}
		return sum;
	}
}

/*	1*5*10*15*20*25
 *  其實2一定比5多，所以只要算幾個5就好，不用真的算出n階層，那也很容易超過max
 * 
 * 
 */

//public class Solution {
//	public int trailingZeroes(int n) {
//		int i;
//		int fiveCount = 0;
//		int j;
//		if (n<5) {
//			return 0;
//		}
//		for ( i = 5; i <= n; i+=5) {
//			if (i%5 ==0) {
//				for (j = 5; j <= i; j*=5) {
//					if (i%5==0) {
//						fiveCount++;
//					}
//				}
//			}
//		}
//		return fiveCount;
//	}
//}
/*
 * n = 0 return 0 for回圈算階層 利用%10 = 0有幾次就代表幾個零
 * 
 * 或是同時有一個二一個五乘起來就會有一個10所以就會有一個零
 */