package com.yao.leetcode.n1790SCheckifOneStringSwapCanMakeStringsEqua;
//XX每個總類字母一樣多就好了
//還要最多只交換一次
//共用時20分

public class N1790 {
	public boolean areAlmostEqual(String s1, String s2) {

		int[] i1 = new int[26];
		int[] i2 = new int[26];
		int count = 0;
		if (s1.length()!=s2.length()) {
			return false;
		}else if (s1.equals(s2)) {
			return true;
		}
		for (int i = 0; i < s1.length(); i++) {
			i1[s1.charAt(i)-'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			i2[s2.charAt(i)-'a']++;
		}
		for (int i = 0; i < i2.length; i++) {
			if (i1[i]!=i2[i]) {
				return false;
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) !=s2.charAt(i)) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}else {
			return false;
		}
	}

}
