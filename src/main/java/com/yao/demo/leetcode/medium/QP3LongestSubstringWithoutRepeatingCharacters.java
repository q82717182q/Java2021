package com.yao.demo.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager;

public class QP3LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s = "abcabcbb";
//		String s = "abcdefg";
		String s1 = "bbbbb";
		String s2 = "pwwkew";
		String s3 = "isawasawsawasaw";
		String s4 = "au";
		String s5 = "aab";
		
		System.out.println(lengthOfLongestSubstring(s5));
	}

//	private static int lengthOfLongestSubstring(String s) {
//		
//        int result = 0;
//        int left = 0;
//        int right = 0;
//        Set<String> set = new HashSet<>();
//        String input = "";
//        
//        
//        while (true) {
//			input = s.substring(left, right);
//			set.contains(input);
//
//			right ++;
//		}
//        
//        
//        return 0;
//	}
	
	private static int lengthOfLongestSubstring(String s) {
		//for迴圈跑輸入的每個位的字
		//一個輸入的指針，指向目前第幾個字、、、、、
		//一個暫存目前還沒重複的字，只要下一個字母有出現重複的存到list並new自己
		if ("".equals(s)) {
			return 0;
		}
		if (s != null && s.length() !=0 && s.trim().isEmpty()) {
			return 1;
		}
		if (s.length() == 1) {
			return 1;
		}
		StringBuilder tempSB = new StringBuilder();
		String tempWord = "";
		List<String> tempList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
//			if((tempSB.substring(tempSB.length()-1, tempSB.length())) != s.substring(i, i + 1)) {
			String currentWord = s.substring(i, i + 1);
			if ("".equals(tempSB.toString())) {
				tempSB.append(currentWord);
			}else if(tempSB.toString().indexOf(currentWord) == -1) {
				tempSB.append(currentWord);
				if (tempSB.length() == s.length()) {
					return s.length();
				}else {
					tempList.add(tempSB.toString());
				}
			}else if (tempSB.toString().equals(s)) {
				tempList.add(tempSB.toString());
			}else {
				tempList.add(tempSB.toString());
				tempSB = new StringBuilder();
				tempSB.append(currentWord);
				if (i == s.length() -1) {
					tempList.add(tempSB.toString());
				}
			}
		}
		System.out.println(tempList);
		
		Map<Integer, List<String>> all = tempList.stream().distinct().collect(Collectors.groupingBy(String::length));
//		Map<Integer, List<String>> all = tempList.stream().collect(Collectors.toSet())
//				.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("---------------------------------------00");
		System.out.println(all);
		System.out.println("---------------------------------------0");
		tempList.stream().distinct().mapToInt(e -> e.length()).max();
		System.out.println("---------------------------------------1");
		System.out.println(tempList.stream().distinct().mapToInt(e -> e.length()).max().orElse(0));
		int maxmum = Integer.MIN_VALUE;
		for (Integer key : all.keySet()) {
			if (key > maxmum) {
				maxmum = key;
			}
		}
		System.out.println("maxmum : " + maxmum);
		return maxmum;
		
	}
}

