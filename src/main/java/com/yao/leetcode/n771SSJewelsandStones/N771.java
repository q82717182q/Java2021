package com.yao.leetcode.n771SSJewelsandStones;

public class N771 {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        
        for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i)==stones.charAt(j)) {
					result ++;
				}
			}
        	
        	
		}
        
        
        return result;
        
        
    }
}