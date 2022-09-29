package com.yao.leetcode.n118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;
/*
 * 畫出來比較好懂
 * 第1個迴圈每次在索引0add1並且往右推
 * 第2個迴圈等到第三層才有啟動，所以條件要設計好
 * 並寫在所以一到size-1都要有自己加下一格的動作
 * 共用時34分
 * */
public class Solution {
	
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < numRows; i++) {
			list.add(0,1);
			for (int j = 1; j < list.size()-1; j++) {
				list.set(j, list.get(j)+list.get(j+1));
			}
			res.add(new ArrayList(list));
		}
    	return res;
    }
}
