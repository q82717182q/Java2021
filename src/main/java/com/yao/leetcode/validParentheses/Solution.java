package com.yao.leetcode.validParentheses;
/*20. Valid Parentheses - Java
 * stack、push、peek、都沒用過，這題還是直接看答案吧
 * 剛好學stack
 * 共用時30分
 * */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    	Stack<Character> s1 = new Stack<Character>();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
			if(c == '('||c == '['||c == '{') {
				s1.push(c);
			}else {
				if (s1.isEmpty()) {
					return false;
				}
				if (c == ')' && s1.peek() !='(') {
					return false;
				}
				if (c == ']' && s1.peek() !='[') {
					return false;
				}
				if (c == '}' && s1.peek() !='{') {
					return false;
				}
				s1.pop();
			}
		}
        return s1.isEmpty();
    }
}



//public class Solution {
//	public boolean isValid(String s) {
//
//		char[] c = new char[s.length()];
//		c = s.toCharArray();
//		int index = 0;
//		int i = 0;
//		for (c[index] = 0; index < c.length; index++) {
//			if (c[index] == '(') {
//				for (i = index + 1; i < c.length; i++) {
//					if (c[i] == ')') {
//						return true;
//					} else {
//						return false;
//					}
//				}
//			}
//		}
//		return false;
//	}
//
//}

/*
 * 先把輸入轉char[] 用foreach先找左括號，分邊這三種找到後再往後面的成員 
 * 找對應的右括號則報對，找到不對應的則報錯
 * 可是有三種，而且有堆疊關係
 * 
 * 
 * 
 */
