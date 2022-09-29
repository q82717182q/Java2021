package com.yao.leetcode.nSS1662CheckIfTwoStringArraysareEquivalent;
//共用時三分鐘
public class N1662 {
public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = true;
	
        String temp1 = "";
        String temp2 = "";
        
        for (int i = 0; i < word1.length; i++) {
			temp1 += word1[i];
		}
        for (int i = 0; i < word2.length; i++) {
        	temp2 += word2[i];
        }
        if (temp1.equals(temp2)) {
			result = true;
		}else {
			result = false;
		}
        return result;
    }
}

//加起來就好了啊