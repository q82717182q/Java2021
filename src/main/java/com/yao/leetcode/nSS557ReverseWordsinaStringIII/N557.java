package com.yao.leetcode.nSS557ReverseWordsinaStringIII;
//一次成功但是感覺超慢，共用時11分
public class N557 {
    public String reverseWords(String s) {
    	String[] arrS = s.split(" ");
    	String result = "";
    	
    	for (int i = 0; i < arrS.length; i++) {
    		StringBuilder sb1 = new StringBuilder();
    		sb1.append(arrS[i]);
    		
    		result += sb1.reverse().toString();
    		if (i < arrS.length-1) {
    			
    			result += " ";
    		}
    	}
    	return result;
    }
    
    
   public static void main(String[] args) {
	String s = "Let's take LeetCode contest";
	String[] arrS = s.split(" ");
	String result = "";
//	for (String string : arrS) {
//		System.out.print(" "+string+" ");
//	}
	
	for (int i = 0; i < arrS.length; i++) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(arrS[i]);
		
		result += sb1.reverse().toString();
		if (i < arrS.length-1) {
			
			result += " ";
		}
	}
	
	System.out.println(result);
	
	
}
}
