package com.yao.leetcode.mySqrt;

public class MySqrt {
	public static int sqrtx(int x){
		if (x <=0) {
			return 0;
		}
		if (x ==1) {
			return 1;
		}
	for (long i = 2; i <= x; i++) {
		if (i*i > x) {
			return (int)(i-1);
		}
	}
	return 0;
	}
	public static void main(String[] args) {
		int num = 2147395600;
		System.out.println(sqrtx(num));
		System.out.println(Integer.MAX_VALUE);
	}
}
/*這樣最基本慢慢算可以，但是當然會最慢(25ms)
 * 可以用二分法計算速度可以快很多(1ms)
 * 還有i*i有很能超過int的範圍，所以變成long比較沒問題
 * */
