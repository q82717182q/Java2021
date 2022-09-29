package com.yao.leetcode.n893GroupsofSpecialEquivalentStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//不懂直接看解答吧ＸＤ

public class N893 {
    public int numSpecialEquivGroups(String[] A) {
    	//要找不重複的組數用set
        Set<String> set = new HashSet<String>();
        for (String a : A) {
			//把每個元素拆成奇偶數
        	char[] odd = new char[(a.length()+1)/2];
        	char[] even = new char[(a.length()+1)/2];
        	for (int i = 0; i < a.length(); i++) {
        		//用i/2當索引巧妙地分開奇偶數
        		if (i%2==0) {
					even[i/2] = a.charAt(i);
				}else {
					odd[i/2] = a.charAt(i);
				}
        		//之後排列整齊加到set，重複自動覆蓋
        		Arrays.sort(even);
        		Arrays.sort(odd);
        		String s1 = new String(even)+new String(odd);
        		set.add(s1);
			}
		}
        //所以最後得到元素個數就是不重複的組數
        return set.size();
    	
    }
    
    public static void main(String[] args) {
    	String[] A = {"abc","acb","bac","bca","cab","cba"};
		Set<String > group = new HashSet<String>();
		for (String a : A) {
			char[] odd = new char[(a.length()+1)/2];
			char[] even = new char[(a.length()+1)/2];
			for (int i = 0; i < a.length(); i++) {
				if (i%2==0) {
					even[i/2]=a.charAt(i);
				}else {
					odd[i/2]=a.charAt(i);
				}
			}
			Arrays.sort(even);
			Arrays.sort(odd);
			String s1 = new String(odd)+new String(even);
			group.add(s1);
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println(i+" ");
		}
	}
}
