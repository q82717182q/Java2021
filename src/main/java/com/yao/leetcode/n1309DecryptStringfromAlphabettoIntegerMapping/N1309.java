package com.yao.leetcode.n1309DecryptStringfromAlphabettoIntegerMapping;

import java.util.*;
//緩慢的字串反轉
//共用時60分
//感覺這方法不是最好
//從尾巴開始看，看到#就一次取下兩位，沒有就一次取一位

public class N1309 {
	public static void main(String[] args) {
		String s = "10#11#12";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i)-'0';
			if (i< s.length()-2 &&s.charAt(i+2)=='#') {
				sb.append((char)(c*10+s.charAt(i+1)-'0'+96));
				i+=2;
			}else {
				sb.append((char)(c+96));
			}
			System.out.println(sb);
		}
		sb.toString();
	}
	
//	DIY
//    public static void main(String[] args) {
//    	String result = "";
//    	String s = "10#11#12";
//    	Map<Integer, Character> map = new HashMap<Integer, Character>();
//    	for (int i = 1; i < 27; i++) {
//			map.put(i, (char)(96+i));
//		}
//    	for (int i = s.length()-1; i >= 0 ; i--) {
//    		String temp ="";
//    		//看到#就一次取下兩位
//			if (s.charAt(i)=='#') {
//				temp = s.substring(i-2, i);
//				i-=2;
//				
//			}else {//沒有就一次取一位
//				temp = s.substring(i, i+1);
//			}
//			result += map.get(Integer.parseInt(temp));
//		}
//    	//因為要反轉所以先弄成sb再轉
//    	StringBuilder sb = new StringBuilder(result);
//    	sb.reverse();
//    	result = sb.toString();
//    	System.out.println(result);
//	}
    
}
//題目都要我用map那我就不客氣啦
//XX #都會用split切掉所以不要理他，
//這題很賤切了會有問題