package com.yao.leetcode.n1025DivisorGame;
/*
 * 選的數字要是n的因數
 * 選完之後n -= x;
 * 
 * 假設大家都選最大因數，這樣n最快變小
 * 最後Alice選完1的時候之前， n要是2
 * 
 * 還是看答案好了
 * 原來是偷雞
 */
public class N1025 {
    public boolean divisorGame(int n) {
        boolean result = false;
    	int turn = 1;
    	
    	while (n!=1) {
    		int x = 0;
    		
    		n -=x;
			turn++;
		}
    	
    	
    	return result;
    }
    
    
    
}
