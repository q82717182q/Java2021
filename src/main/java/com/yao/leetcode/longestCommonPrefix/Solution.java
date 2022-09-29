package com.yao.leetcode.longestCommonPrefix;
/*
 * 14. Longest Common Prefix
 * 用第一個字當公共字首
 * 找了一遍發現有不對在減一個字去比對
 * 直到完全正確及迴傳
 * 題目限制0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 * 所以要加上長度為0的回傳值""
 * 可是while直接用indexof感覺就是直接用已有的方法啊偷吃步嗎
 * 用最短字串當公共字首（優化）
 * */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
        	return "";
		}
        String curPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
        	while (strs[i].indexOf(curPrefix)!= 0) {
        		curPrefix = curPrefix.substring(0, curPrefix.length()-1);
        		if (curPrefix.isEmpty()) {
        			return "";
			}
			}
		}
        return curPrefix;
    }
}


/*
 * 
 * 第二層for迴圈取出每個成員，
 * 用第一層比對第一個字開始，直到沒有正確的
 * 如果第一個就不正卻，回傳""
 * 或回傳公共字首
 * 
 * 
 * */