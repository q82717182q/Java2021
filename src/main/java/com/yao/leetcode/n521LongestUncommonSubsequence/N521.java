package com.yao.leetcode.n521LongestUncommonSubsequence;
/*
 * 應該就用map吧
 * a, b都存完之後看誰短去減另一個
 * 看答案吧
 * 答案很怪誒，跟題目意思感覺有差
 */
public class N521 {
    public int findLUSlength(String a, String b) {
        
    	
    	return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
