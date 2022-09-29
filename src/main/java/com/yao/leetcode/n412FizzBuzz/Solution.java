package com.yao.leetcode.n412FizzBuzz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * https://blog.csdn.net/weixin_43314519/article/details/107742423
 * 嚴格的條件先處理
 * 共用時20分
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
    	List<String> ans = new ArrayList<String>();
    	
    	for (int i = 1; i <= n; i++) {
			if (i%3==0&&i%5==0) {
				ans.add("FizzBuzz");
			}
			else if (i%3==0) {
				ans.add("Fizz");
			}
			else if (i%5==0) {
				ans.add("Buzz");
			}else {
				ans.add(Integer.toString(i));
			}
		}
    	
    	
    	
		return ans;
    	
    	
    	
    }
}
