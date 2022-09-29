package com.yao.leetcode.isPalindrome;

/*125	Valid Palindrome  
 * a~z 0~9可以用透過變成char大於小於關係
 * reverse要stringbuffer才能用，所以要先反轉才toString
 * 如果是return布林值的話，也可以直接當作是if判斷式使用就省掉一個if了
 * */
public class Solution {
	public boolean isPalindrome(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if('a' <= arr[i] && arr[i]<='z' || '0'<=arr[i]&&arr[i]<='9') {
				sb1.append(arr[i]);
			}
		}
		
		return sb1.toString().equals(sb1.reverse().toString());
		
	}
}

/*
 * 把輸入字串變成小寫，且只有26字母通過if 全部存到stringbuilder 然後把sb tostring 再做反轉比對是否相同
 * 
 * 
 * 
 * 
 */
