package com.yao.leetcode.n942SDIStringMatch;

public class N942 {
    public static int[] diStringMatch(String s) {
    	int len = s.length();
        int[] result = new int[len+1];
    	char[] c = s.toCharArray();
    	int countI = 0;
    	int countD = len;
    	for (int i = 0; i < c.length; i++) {
			if (c[i]=='I') {
				result[i] = countI++;
			}else {
				result[i] = countD--;
			}
		}
    	if (c[len-1]=='I') {
    		result[len] = countI;
			
		}else {
			result[len] = countD;
		}
    	return result;
    }
    public static void main(String[] args) {
		String s = "IDID";
		diStringMatch(s);
	}
}
