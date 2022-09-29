package com.yao.leetcode.n121BestTimetoBuyandSellStock;

import java.util.Arrays;
/*
 * 
 * 一開始方向就想錯了，不用考慮那麼多
 * 就當作是一個曲線圖，把每次最低點存下來
 * 把每次當下利潤存起來，如果利潤更大就取代
 * 更小就當作沒事情發生
 * 一開始利潤設定零所以也不用考慮從頭到尾都沒利潤的情況發生
 * 共用時20分
 * */
public class Solution {
    public int maxProfit(int[] prices) {
    	int profit = 0;
    	int min = Integer.MAX_VALUE;
    	for (int i = 0; i < prices.length; i++) {
			if (prices[i]<min) {
				min = prices[i];
			}
			int now = 0;
			now = prices[i]-min;
			if (profit < now) {
				profit = now;
			}
		}
    	return profit;
    }
}

/*
 * 錯慘了！！
 * XX先用雙層for迴圈排除沒有利潤的情況
 * 
 * XX再排序所有元素，由最左邊與最右邊開始找利潤最大值
 * XX先固定最小值，找符合的最大值，都沒有
 * XX則改成第二大值固定找符合最小時，如此交叉比對
 * XX可是這樣好像也有問題，因為profit看過是最大與最小的
 * XXlength就會覺得沒有取到最大長度的情況發生
 * 
 * 
 * */
 