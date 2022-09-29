package com.yao.leetcode.nS191Numberof1Bits;

/*
 * https://www.itread01.com/content/1546157522.html
 * 二進位來說 &就是都是1則顯示1，其他都是0
 * n       = 110100
 * n-1     = 110011
 * n&(n-1) = 110000
 * 共用時19分
 * */
 
public class Solution {
    public int hammingWeight(int n) {
    	int count = 0;
    	for (int i = 0; i < 32; i++) {
			if ((n&1)==1) {
				count++;
                n >>=1;
			}else {
                n >>=1;
			}
		}
    	return count;
    }
}
/*
 * OO個位數為1則count++
 * OO判斷完成右推>>
 * 
 * */
 