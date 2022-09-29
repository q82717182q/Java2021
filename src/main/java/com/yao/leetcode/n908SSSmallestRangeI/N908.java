package com.yao.leetcode.n908SSSmallestRangeI;
/*
 * 最小差距就是零，不是零就慢慢加上去
 */
public class N908 {
    public static int smallestRangeI(int[] A, int K) {
        int minA =Integer.MAX_VALUE,maxA = Integer.MIN_VALUE;
        if (A.length == 1) {
			return 0;
		}
        for (int i : A) {
			minA = Math.min(i, minA);
			maxA = Math.max(i, maxA);
			
		}
        System.out.println("minA:"+minA+" maxA:"+maxA);
        if (maxA-minA <= 2*K) {
			return 0;
		}else {
			return maxA-K-(minA+K);
		}
    }
    public static void main(String[] args) {
		int[] A = {2,7,2};
		int K = 1;
		smallestRangeI(A, K);
	}
}
