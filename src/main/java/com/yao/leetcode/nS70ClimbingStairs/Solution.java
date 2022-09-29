package com.yao.leetcode.nS70ClimbingStairs;

import javax.xml.transform.Templates;


/*
 * 達第n個臺階只和第n-1和第n-2有關
 * 共用時15分
 * 
 * */
public class Solution {
    public int climbStairs(int n) {
    	 int n1 = 2;
         int n2 = 1;
         int temp = n1+n2;
    	if (n==1) {
			return 1;
		}
    	if (n==2) {
    		return 2;
    	}
    	for (int i = 3; i <= n; i++) {
    		temp = n1+n2;
    		n2=n1;
    		n1=temp;
    		
		}
       return temp;
    }
}

/*
 * 這種題目以前教過
 * 不過是在用機率的時候教的
 * 
 * */
