package com.yao.leetcode.n13RomantoInteger;
/*
 * 用hashmap定義好
 * 
 * */

import java.util.HashMap;
import java.util.Map;
//hashmap定義好每個符號
//
//判斷左邊大於右邊直接加
//
//小於就減掉
//共用時32分
//從個位數開始往左看
public class Solution {
	public int romanToInt(String s) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		int length= s.length();
		int result = m.get(s.charAt(length-1));
		for (int i = length-2; i >=0; i--) {
			if (m.get(s.charAt(i+1)) <= m.get(s.charAt(i))) {
				result += m.get(s.charAt(i));
			}else {
				result -= m.get(s.charAt(i));
			}
		}
		
		
		return result;
	}
}


/*
 * 數字要判斷下一個是多少決定是加還是減
 * result累加結果
 * 
 * 
 * */
