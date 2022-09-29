package com.yao.leetcode.n1528SSShuffleString;

import java.util.HashMap;
import java.util.Map;

//有key 有value看來又是用map，不過超慢
/*
 * Runtime: 5 ms, faster than 14.53% of Java online submissions for Shuffle String.
Memory Usage: 39.5 MB, less than 16.28% of Java online submissions for Shuffle String.
 * 
 * 看解答1ms
 * 
 * */
public class N1528 {
    public String restoreString(String s, int[] indices) {
    	//解答1ms
    	
    	char[] str = new char[s.length()];
    	for (int i = 0; i < str.length; i++) {
			str[indices[i]] = s.charAt(i);
		}
    	return new String(str);
    }
    public static void main(String[] args) {
		System.out.println(Integer.parseInt("123"));
	}
}
    	
    	
//自己弄的5ms        String result = "";
//        Map<Integer, Character> map = new HashMap<Integer, Character>();
//    	for (int i = 0; i < indices.length; i++) {
//			map.put(indices[i], s.charAt(i));
//		}
//        for (int i = 0; i < indices.length; i++) {
//			result+= map.get(i);
//		}
//        
//        return result;

