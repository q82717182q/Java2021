package com.yao.leetcode.n387FirstUniqueCharacterinaString;
/*
 * 這邊是用ASCII做也學過
 * 計算int[]次數
 * 然後從頭開始找出元素是一的索引回傳
 * 共用時21分
 * */


public class Solution {
	public int firstUniqChar(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)-'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)-'a']==1) {
				return i;
			}
		}
	return -1;
	}
}



/*
 * XX用陣列變成char[]
 * XX然後用xor找出沒對稱的字跟他的索引，應該不能這樣用，
 * 因為這方法只能找出奇數，並不能找出出現一次而已，
 * 而且還不知道只出現一次的數字在哪
 */
