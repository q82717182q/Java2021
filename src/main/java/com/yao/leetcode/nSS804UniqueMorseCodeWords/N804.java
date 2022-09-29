package com.yao.leetcode.nSS804UniqueMorseCodeWords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//共用時20分鐘
public class N804 {
	public int uniqueMorseRepresentations(String[] words) {
		int result = 0;

		Set<String> set = new HashSet<String>();
		Map<Character, String> map = new HashMap<Character, String>();
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		for (int i = 0; i < 26; i++) {
			map.put((char) (i + 97), morse[i]);
		}

		System.out.println(map.get('a'));
		System.out.println((char) (0 + 97));

		for (int i = 0; i < words.length; i++) {
			String word = "";
			for (int j = 0; j < words[i].length(); j++) {
				word += map.get(words[i].charAt(j));
			}
			set.add(word);
		}
		
		//計算set有幾個元素
		for (String string : set) {
			result++;
		}
		return result;

	}

	public static void main(String[] args) {
		int result = 0;
		String[] words = { "gin", "zen", "gig", "msg" };

		Set<String> set = new HashSet<String>();
		
		//用map把摩斯密碼對應的表列好
		Map<Character, String> map = new HashMap<Character, String>();
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		for (int i = 0; i < 26; i++) {
			map.put((char) (i + 97), morse[i]);
		}

		System.out.println(map.get('a'));
		System.out.println((char) (0 + 97));

		
		for (int i = 0; i < words.length; i++) {
			String word = "";
			//把每組字的摩斯密碼組在一起
			for (int j = 0; j < words[i].length(); j++) {
				word += map.get(words[i].charAt(j));
			}
			//存到set重複的自動覆蓋
			set.add(word);
		}
		System.out.println(set);

	}
}
//不能重複所以用set