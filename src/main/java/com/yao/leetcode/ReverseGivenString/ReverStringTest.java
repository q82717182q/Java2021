package com.yao.leetcode.ReverseGivenString;
//https://leetcode.com/problems/reverse-string/solution/
class Solution {
	int i = 0;
	public void helper(char[] s, int left, int right) {
		System.out.printf("----%d----%n",i);
		System.out.println(s);
		if (left >= right)
			return;
		char tmp = s[left];
		s[left++] = s[right];
		s[right--] = tmp;
		System.out.println( s);
		System.out.printf("----%d----%n",i++);

		helper(s, left, right);
	}

	public void reverseString(char[] s) {
		helper(s, 0, s.length - 1);
		
	}
}

public class ReverStringTest {
	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		Solution solution = new Solution();
		solution.reverseString(s);
		System.out.println(s);
	}
}
