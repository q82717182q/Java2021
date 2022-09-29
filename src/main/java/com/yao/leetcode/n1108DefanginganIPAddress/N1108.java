package com.yao.leetcode.n1108DefanginganIPAddress;

public class N1108 {
    public static String defangIPaddr(String address) {
    	String result = "";
    	String a = "[.]";
    	String[] arrAdd = address.split("\\.");
    	for (int i = 0; i < arrAdd.length-1; i++) {
			result += arrAdd[i];
			result += a ;
		}
    	result += arrAdd[arrAdd.length-1];
    	
    	System.out.println(result);
		return result;
    }

}
