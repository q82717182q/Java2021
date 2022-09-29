package com.yao.leetcode.nS171ExcelSheetColumnNumber;

/*
 * 從第一位數開始看
 * 當作26進位
 * 用ASCII觀念
 * 累加結果
 * 第一次run成功不過錯一點點
 * 共用時24分
 */
public class Solution {
	public int titleToNumber(String columnTitle) {

		int result = 0;
		for (int i = 0; i <= columnTitle.length(); i++) {
			result *=26;
			result += (columnTitle.charAt(i)-'A'+1);
		}
		return result;
	}

}

/*
 * 可以看做26進位法 從後面數過來 倒數第一位就是直接加 倒數第二位就是加26^1*該位 倒數第3位就是加26^2*該位依此類推 用char -
 * A-1就可以用ASCII來表達數字
 */
