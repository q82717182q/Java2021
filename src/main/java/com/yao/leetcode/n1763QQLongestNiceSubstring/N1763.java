package com.yao.leetcode.n1763QQLongestNiceSubstring;

import java.util.Arrays;

//大小寫都要有出現
//最長的判斷
//看答案吧
public class N1763 {

	public static String longestNiceSubstring(String s) {
		 char[] c = s.toCharArray();
	        int n = c.length, diff = 0, len = 0, ansl = -1, ansr = -1;
	        int[] ch = new int[26], CH = new int[26];
	        for (int l = 0; l < n; l++) {
	            int maxR = -1;//当前最长美好子字符串右边界
	            Arrays.fill(ch, 0);//重置当前美好子字符串中的小写字符数
	            Arrays.fill(CH, 0);//重置当前美好子字符串中的大写字符数
	            diff = 0;//未配对的字符种类数
	            for (int r = l; r < n; r++) {//寻找右边界
	                if (c[r] > 'Z') {
	                    if (ch[c[r] - 'a']++ == 0) {
	                        if (CH[c[r] - 'a'] > 0)
	                            diff--;
	                        else
	                            diff++;
	                    }                    
	                } else {
	                    if (CH[c[r] - 'A']++ == 0) {
	                        if (ch[c[r] - 'A'] > 0)
	                            diff--;
	                        else
	                            diff++;
	                    }  
	                }
	                if (diff == 0)
	                    maxR = r;
	            }
	            if (maxR != -1) {//当前存在美好子字符串
	                if (maxR - l + 1 > len) {
	                    len = maxR - l + 1;
	                    ansl = l;
	                    ansr = maxR;
	                }
	                l = maxR;//指针直接移动到有边界后
	            }
	        }
	        if (len == 0)
	            return "";
	        return s.substring(ansl, ansr + 1);
	}
	
	public static void main(String[] args) {
		String s = "YazaAay";
		longestNiceSubstring(s);
		System.out.println('A'>'Z');
		int a = 2;
		if (a++==2) {
			System.out.println("(1)"+a);
		}
		if (a++==2) {
			System.out.println("(2)"+a);
		}
		System.out.println("(3)"+a);
		
	}
}
