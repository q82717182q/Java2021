package com.yao.demo.listnodedemo;

public class ListNodeMain {
	public static void main(String[] args) {
		int[] intArr1 = {2,4,3};
		int[] intArr2 = {5,6,4};
		
		ListNode listNode1 = new ListNode();
		ListNode listNode2;
		if (true) {
//			ListNode listNode2 = new ListNode();
			listNode2 = new ListNode();
		}
		System.out.println(listNode2);
		ListNode lnA = new ListNode();
		ListNode lnB = new ListNode();

		useNext(lnA,lnB);
	}
	private static void useNext(ListNode lnA, ListNode lnB) {
		
		//案例一，直接用等於不會讓內容跟著改變
		ListNode lnC = lnA;
		lnC.next = lnB;
		ListNode lnE = new ListNode();
		lnB = lnA; //lnD並不會跟著變成lnA
		
		//案例二，用參考來改變next
		//用指針改變參數
//		ListNode ans = new ListNode();
//		ListNode temp = ans;
//		temp.next = lnA;
//		temp = temp.next;
//		temp.next = lnB;
//		
		
		
		
	}

}
