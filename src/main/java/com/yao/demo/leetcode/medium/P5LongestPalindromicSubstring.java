package com.yao.demo.leetcode.medium;

public class P5LongestPalindromicSubstring {
	public static void main(String[] args) {
		
		
		
		longestPalindrome("");
	}
    public static String longestPalindrome(String s) {
    	//從輸入長度本身開始遞減一個一個去測試subString是否回文
    	
    	
    	String result = s;
    	int size = s.length();
    	while (size != 0) {
			int start = 0;
			while (start + size > s.length()) {
				
				start ++;
				
			}
    		

    		size --;
			
		}
    	
        return "";
    }
}
