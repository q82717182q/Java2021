package com.yao.demo.nullpointerdemo;

import org.springframework.util.StringUtils;

import com.yao.demo.listnodedemo.ListNode;

public class NullJudgment {
	
	public static void main(String[] args) {
//		ListNode listnode1 = null;
		ListNode listnode1 = new ListNode(1);
//		if (listnode1 != null 
//				|| listnode1.next != null) {
//			System.out.println("check");
//		}   //非空判斷用&& 而不是||
		
		if (listnode1 != null && listnode1.val != 0) 
		System.out.println("check");

		String result = tryCatchFinally();
		System.out.println("result : " + result);
		
		
		String str1 ;
		String str2 = "";
		String str3 = null;
		int a = 1;
		a++;

	}

	private static String tryCatchFinally() {
		// TODO Auto-generated method stub
		try {
			System.out.println("try");
			return "trying";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
			return "catching";
		} finally {
			System.out.println("finally");
			return "finallying";
			
		}
	}
}
