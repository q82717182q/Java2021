package com.yao.leetcode.n1768MergeStringsAlternately;
//多出來的用if就好了啊想那麼多，共用時27分
public class N1768 {
	public String mergeAlternately(String word1, String word2) {
		StringBuilder sb1 = new StringBuilder();
		int min = Math.min(word1.length(), word2.length());

		for (int i = 0; i < min; i++) {
				sb1.append(word1.charAt(i));
				sb1.append(word2.charAt(i));
			}
		
			if (word1.length()>word2.length()) {
				sb1.append(word1.substring(word2.length()));
				
			}else {
				sb1.append(word2.substring(word1.length()));
			}
			
		return sb1.toString();

	}

	public static void main(String[] args) {

	}

}
