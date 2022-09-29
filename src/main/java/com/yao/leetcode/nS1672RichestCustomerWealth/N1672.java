package com.yao.leetcode.nS1672RichestCustomerWealth;

public class N1672 {
    public static int maximumWealth(int[][] accounts) {
    	int max = 0;
    	System.out.printf("length:%d",accounts[0].length);
    	for (int i = 0; i < accounts.length; i++) {
    		int temp = 0;
    		//注意這邊要用accounts[i].length，而不是accounts.length
			for (int j = 0; j < accounts[i].length; j++) {
				temp += accounts[i][j];
				System.out.printf(" i:%d j:%d ",i,j);
				if (temp >= max) {
					max = temp;
				}
			}
		}
		return max;
    }
    public static void main(String[] args) {
    	int[][] accounts = {{1,2,3},{3,2,1}};
    	maximumWealth(accounts);
	}
}
