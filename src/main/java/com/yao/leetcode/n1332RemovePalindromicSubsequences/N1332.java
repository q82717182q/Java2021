package com.yao.leetcode.n1332RemovePalindromicSubsequences;
//沒頭緒看解答
//其實不用想太多
public class N1332 {
    public static int removePalindromeSub(String s) {
    	StringBuilder s1 = new StringBuilder(s);
    	StringBuilder s2 = new StringBuilder(s);
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s1.equals(s2));
    	System.out.println(s1==s2);
    	if (s.equals(new StringBuilder(s).reverse().toString())) {
			return 1;
		}else {
			return 2;
		}
    	
    	
    }
    public static void main(String[] args) {
    	System.out.println(100+10.1f);
    	removePalindromeSub("ababa");
	}
}
