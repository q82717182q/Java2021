package com.yao.leetcode.n1720DecodeXORedArray;
//看不懂，看答案吧
public class N1720 {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
			result[i+1] = result[i]^encoded[i];
		}
        
        
        return result;
    	
    	
    }
    
    public static void main(String[] args) {
		System.out.println(7^3);
	}
}
