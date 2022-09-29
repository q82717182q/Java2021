package com.yao.leetcode.nSS1614MaximumNestingDepthoftheParentheses;
//直觀解，共用時9分鐘
public class N1614 {
    public int maxDepth(String s) {
        int resultMax = 0;
        int temp = 0;
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
			if (c[i]=='(') {
				temp++;
			}
			if (c[i]==')') {
				if (resultMax <= temp) {
					resultMax = temp;
				}
				temp--;
			}
		}
        return resultMax;
    }
}

//感覺只要回傳左括號遇到右括號之前存起來，最大的即為最大深度
//用char[]
