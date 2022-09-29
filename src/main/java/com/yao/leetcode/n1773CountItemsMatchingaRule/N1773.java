package com.yao.leetcode.n1773CountItemsMatchingaRule;

import java.util.*;
import java.util.concurrent.CountDownLatch;
//共用時10分
public class N1773 {

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		//要另外element才能取一維list
		List<String> element = new ArrayList<String>();
		//文字得比較記得都要用equals不然會錯
			for (int i = 0; i < items.size(); i++) {
				element = items.get(i);
				if (ruleKey.equals("type")) {
					if (element.get(0).equals(ruleValue)) {
						count++;
					}
				}
				if (ruleKey.equals("color")) {
					if (element.get(1).equals(ruleValue)) {
						count++;
					}
				}
				if (ruleKey.equals("name")) {
					if (element.get(2).equals(ruleValue)) {
						count++;
					}
				}
			}
		return count;
	}
	public static void main(String[] args) {
		String ruleKey = "color";
		String ruleValue = "silver";
		String[][] arr = {
				{"phone","blue","pixel"},
				{"computer","silver","lenovo"},
				{"phone","gold","iphone"}};
		//用foreach把二維陣列存到list
		List<List<String>> items = new ArrayList<List<String>>();
		for (String[] i : arr) {
			items.add(Arrays.asList(i));
		}
		System.out.println(countMatches(items, ruleKey, ruleValue));
	}
	
}
