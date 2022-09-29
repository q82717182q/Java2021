package com.yao.leetcode.n917SReverseOnlyLetters;

import java.util.Stack;

//直接用sb上去反轉沒問題，但是遇到非字母勒＠＠
//用Character.isLetter()
//共用時30分
public class N917 {
    public static String reverseOnlyLetters(String S) {
    	StringBuilder sb1 = new StringBuilder();
    	StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
        	if (Character.isLetter(S.charAt(i))) {
				sb1.append(S.charAt(i));
			}
		}
        sb1 = sb1.reverse();
        int count = 0;
        
        for (int i = 0; i < S.length(); i++) {
        	if (Character.isLetter(S.charAt(i))) {
				sb2.append(sb1.charAt(count));
				count++;
			}else {
				sb2.append(S.charAt(i));
			}
		}
        
    	return sb2.toString();
    }
    public static void main(String[] args) {
    	String S="Zb-cd";
    	Stack<Character> st1 = new Stack<Character>();
    	reverseOnlyLetters(S);
	}
}
