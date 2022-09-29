package com.yao.leetcode.n1189MaximumNumberofBalloons;

import java.util.HashMap;
import java.util.Map;

//balloon所以字都出現記數一次
//XX所有字數都出現用map!!??

//這裡一樣利用ASCII
//共用時40分
public class N1189 {
    public static int maxNumberOfBalloons(String text) {
        int result = Integer.MAX_VALUE;
    	int[] count = new int[26];
    	for (int i = 0; i < text.length(); i++) {
			count[text.charAt(i)-'a']++;
		}
    	
    	for (int i = 0; i < 5; i++) {
			char c = "balon".charAt(i);
			int num = count[c-'a'];
			if (c=='l'||c=='o') {
				num/=2;
			}
			if (num == 0) {
				return 0;
			}
			result = Math.min(result, num);
		}
    	return result;
    }
	public static void main(String[] args) {
		String text = "nlaebolko";
		maxNumberOfBalloons(text);
		
		int[] count = new int[26];
		for (int i = 0; i < text.length(); i++) {
			count[text.charAt(i)-'a']++;
		}
		
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			char c = "balon".charAt(i);
			int num = count[c-'a'];
			if (c == 'l'||c=='o') {
				
			}
		}
		
		
		
	}
}
