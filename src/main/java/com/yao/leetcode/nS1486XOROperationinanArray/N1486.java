package com.yao.leetcode.nS1486XOROperationinanArray;

public class N1486 {
    public static int xorOperation(int n, int start) {
        int output = 0;
        for (int i = 0; i < n; i++) {
        	System.out.printf("output:%d i:%d start:%d%n",output,i,start);
			output ^= start;
			start+=2;
		}
        return output;
    }
   public static void main(String[] args) {
	   int n = 4;
	   int start = 3;
	xorOperation(n, start);
	System.out.println(3^5^7^9);
}
}
