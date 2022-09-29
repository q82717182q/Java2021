package com.yao.leetcode.n1732FindtheHighestAltitude;
//共用時5分鐘，照題目打
public class N1732 {
    public int largestAltitude(int[] gain) {
        int result = 0;//最終最大
        int max = 0;//給一個暫存最大
        for (int i = 0; i < gain.length; i++) {
			max += gain[i];
			if (max>=result) {//暫時最大大於最終最大則取代
				result = max;
			}
		}
        return result;
    }
}
