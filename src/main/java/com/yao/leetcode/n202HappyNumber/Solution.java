package com.yao.leetcode.n202HappyNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 自己重複出現就代表會無限迴圈
 * 而不是考慮無限出現時要什麼時候中斷
 * 共用時72分
 * */

class Solution {
	public boolean isHappy(int n) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (n != 1) {
			if (map.containsKey(n)) {
				return false;
			}
			map.put(n, 1);
			while (n != 0) {
				sum += (n % 10) * (n % 10);
				n /= 10;
			}
			n = sum;
			sum = 0;
		}
		return true;
	}
}

//QQ我覺得我寫的應該對啊！！
//public class Solution {
//    public boolean isHappy(int n) {
//    	int n1 = n;
//    	int s = 0;
//    	int sqr = 0;
//    	int sum = 0;
//    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//    	while (true) {
//    		if (n1==0) {
//    			if (map.containsKey(sum)) {
//    				return false;
//    			}
//    			map.put(sum, 1);
//				n1 = sum;
//				sum=0;
//			}
//    		s = n1%10 ;
//    		n1 /= 10;
//    		sqr = s^s;
//    		sum += sqr;
//    		
//			if (sum ==1) {
//				return true;
//			}
//		}
//    }
//}
/*
 * for迴圈%10 ==零為止所有數平方相加 在無限重複到出現1為止 但是怎樣才會出現falst勒
 * 
 */
