package com.yao.leetcode.n1217SSMinimumCosttoMoeChipstoTheSamePositio;
/* 差距為奇數cost1，偶數cost0
 * 算幾個奇數幾個偶數
 * 少的數量就是答案
 * 
 * 
 * 
 */
public class N1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {
			if ((position[i] & 1 )==0) {
				even++;
			}else {
				odd++;
			}
		}
        
        
        
        return Math.min(odd, even);
    }
    public static void main(String[] args) {
		System.out.println(100&1);
	}
}
