package com.yao.leetcode.n392IsSubsequence;

import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
/*
 * 看答案吧
 * 用時30分
 * */
public class N392 {
	public static boolean isSubsequence(String s, String t) {

		//记录s中字符在t中出现的位置
        int index = -1;//這邊要-1才會起始總和為0，不然直接令零的話等等會比不到第一位
        System.out.println(index);
        int count = 1;
        //从头向后遍历字符串t
        for (char c : s.toCharArray()) {
        	
        	System.out.println("char c:"+c);
        	System.out.println("index+1:"+(index + 1));
            index = t.indexOf(c, index + 1);//每次要從index的下一位開始找所以要+1
            
            System.out.println("--------index"+count+":"+index);
            count++;
            if (index == -1) {
                return false;
            }
        }
        //s = "abc", t = "ahbgdc"
        return true;
	}
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		int index = -1;
		isSubsequence(s, t);
	}
}
