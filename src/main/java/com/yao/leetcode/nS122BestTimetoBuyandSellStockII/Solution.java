package com.yao.leetcode.nS122BestTimetoBuyandSellStockII;
/*
 * 共用時60分
 * 
 * 
 * 
 * 
 */



class Solution {
    public int maxProfit(int[] prices) {
    	int len = prices.length;
    	int small = Integer.MAX_VALUE;
    	int profit = 0;
    	for (int i = 0; i < len; i++) {
			if (prices[i]<small) {
				small = prices[i];
			}
			int now = prices[i] - small;
			if (now > 0) {
				small = prices[i];
				profit +=now;
			}
			
			
		}
    	return profit;
    	
    }
}







//差一點只解出幾次
//public class Solution {
//
//    public int maxProfit(int[] prices) {
//        int profit = 0;
//        boolean b1 = false;
//        int buy = 0;
//        int sell = 0;
//        for (int i = 0; i < prices.length-i; i++) {
//        	if ((prices[i+1]-prices[i])>0) {
//        		if(b1 == false) {
//        				b1 = true;
//        				buy = prices[i];
//        			}
//			}
//        	if ((prices[i+1]-prices[i])<0) {
//        		if(b1 == true) {
//        			b1 = false;
//        			sell = prices[i];
//        			profit += sell-buy;
//        		}
//        		if((i+1)==prices.length){
//        			profit += sell-buy;
//        		}
//        	}
//		}
//        return profit;
//    }
//}


/*
 * 
 * 只要下一個是上升就買入，直到下一個下跌前賣出
 * 啊還可以這樣預測未來喔
 * 就是後者減前者負的就賣，正的就買，等於零就不動，買了就不能再買賣了就不能再賣
 * 宣告一個布林來當作買賣狀態，
 * 宣告一個int 利潤
 * 最後把價差總和起來
 */

