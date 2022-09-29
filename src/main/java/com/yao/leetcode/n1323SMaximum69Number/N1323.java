package com.yao.leetcode.n1323SMaximum69Number;
//從頭開始看，看到第一個六則回傳，6變成9的數字，都是9就傳自己
public class N1323 {
    public static int maximum69Number (int num) {
     char[] c = Integer.toString(num).toCharArray();
     System.out.println(new String(c));
     for (int i = 0; i < c.length; i++) {
		if (c[i]=='6') {
			c[i]='9';
			return Integer.valueOf(new String(c));
		}
	}
    	
     return num;
    }
    
    public static void main(String[] args) {
		int num =9669;
		maximum69Number(num);
	}
}
