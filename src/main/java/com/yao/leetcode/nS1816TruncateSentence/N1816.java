package com.yao.leetcode.nS1816TruncateSentence;
//直觀解，共用時10分鐘吧
public class N1816 {
    public static String truncateSentence(String s, int k) {
        String result = "";
        String[] arrS = s.split(" ", k+1);
        for (int i = 0; i < k; i++) {
			result += arrS[i];
			if (i < k-1) {
				result += " ";
			}
			
		}
        
        return result;
    }
    
    public static void main(String[] args) {
    	String s = "Hello how are you Contestant";
    	int k = 4;
    	truncateSentence(s, k);
//    	String[] arrS=s.split(" ", 5);
//    	for (String string : arrS) {
//			System.out.print(string);
//		}
	}
}
//用split