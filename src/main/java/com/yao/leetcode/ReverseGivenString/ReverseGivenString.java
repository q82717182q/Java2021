package com.yao.leetcode.ReverseGivenString;

import java.util.ArrayList;

class ReverseGivenString {
	private String string;
	public ReverseGivenString(String string) {
		this.string = string;
	}
	public void show() {
		char[] c1 = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			c1[string.length() - (i + 1)] = string.charAt(i);
		}
		System.out.println(c1);
	}
}
