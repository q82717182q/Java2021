package com.yao.leetcode.n746MinClimbingStairs;
/*
 * 是兩兩一組去比嗎可是感覺不像
 * 直接看答案
 */
public class N746 {
	public int minCostClimbingStairs(int[] cost) {
       int dp0 = 0;	//現在這格
       int dp1 = 0; //走一格
       int dp2 = 0; //走兩格
       
       for (int i = 2; i < cost.length+1; i++) {//終點為cost.length+1
		dp0 = Math.min(dp1+cost[i-1], dp2+cost[i-2]);
		dp2 = dp1;
		dp1 = dp0;
		//所有變數在推進一格
		
		
	}
       return dp0;//回傳現在這格
       
       
	} 
	//[10,15,20]
}
