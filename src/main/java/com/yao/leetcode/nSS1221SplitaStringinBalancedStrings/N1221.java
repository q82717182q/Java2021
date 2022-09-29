package com.yao.leetcode.nSS1221SplitaStringinBalancedStrings;

import java.util.ArrayList;
import java.util.List;
//用char[]直觀解決，共用時9分鐘
public class N1221 {
public static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        char[] arrC = s.toCharArray();
        System.out.println(arrC);
        System.out.println("==========for==========");
        for (int i = 0; i < arrC.length; i++) {
			if (arrC[i]=='R') {
				count++;
			}
			if (arrC[i]=='L') {
				count--;
			}
			if (count == 0) {
				result++;
			}
		}
        return result;
    }
public static void main(String[] args) {
	String s = "RLRRLLRLRL";
	balancedStringSplit(s);
}
}

//利用list對應key去加減，回到0時則回傳一組，
//或是用char陣列讀取